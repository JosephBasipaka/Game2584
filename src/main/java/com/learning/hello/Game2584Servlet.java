package com.learning.hello;



	import jakarta.servlet.ServletConfig;
	import jakarta.servlet.ServletException;
	import jakarta.servlet.annotation.WebServlet;
	import jakarta.servlet.http.HttpServlet;
	import jakarta.servlet.http.HttpServletRequest;
	import jakarta.servlet.http.HttpServletResponse;
	import java.io.IOException;

	import org.thymeleaf.TemplateEngine;
	import org.thymeleaf.context.WebContext;
	import org.thymeleaf.templatemode.TemplateMode;
	import org.thymeleaf.templateresolver.WebApplicationTemplateResolver;
	import org.thymeleaf.web.IWebExchange;
	import org.thymeleaf.web.servlet.JakartaServletWebApplication;

import com.learning.hello.controller.Game2584Controller;


	@WebServlet("/Game2584")
	public class Game2584Servlet extends HttpServlet {
		private static final long serialVersionUID = 1L;
		private JakartaServletWebApplication application;
		private TemplateEngine templateEngine;
		Game2584Controller board;
	    
		@Override
		  public void init(ServletConfig config) throws ServletException {
		    super.init(config);
		    
		    application = JakartaServletWebApplication.buildApplication(getServletContext());
		    final WebApplicationTemplateResolver templateResolver = 
		        new WebApplicationTemplateResolver(application);
		    templateResolver.setTemplateMode(TemplateMode.HTML);
		    templateResolver.setPrefix("/WEB-INF/templates/");
		    templateResolver.setSuffix(".html");
		    templateEngine = new TemplateEngine();
		    templateEngine.setTemplateResolver(templateResolver);
		    board = new Game2584Controller();
		  }

		
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			final IWebExchange webExchange = this.application.buildExchange(request, response);
		    final WebContext ctx = new WebContext(webExchange);
		    templateEngine.process("Game2584", ctx, response.getWriter());
		}

		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			
			var out = response.getWriter();
			final IWebExchange webExchange = 
			        this.application.buildExchange(request, response);
			final WebContext ctx = new WebContext(webExchange); 
			String action = request.getParameter("action");
			board.performAction(action);
			int k = 1;
			for ( int i = 0; i < board.board.length; i++ )
	        {
	            for ( int j = 0; j < board.board[i].length; j++ )
	            {
	            	
	            	String s = board.board[i][j].toString() + " ";
	                ctx.setVariable("game" + k,s);
	                k++;
	            }
	        }
	        ctx.setVariable("score", board.score);
	        ctx.setVariable("highTile", board.getHighTile());
				
			templateEngine.process("Game2584", ctx, out);
//			response.sendRedirect(request.getServletPath());
			doGet(request,response);


	}
}
