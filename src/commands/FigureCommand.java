package commands;

import model.Figure;

public class FigureCommand implements Command {

	private Figure figure=new Figure();
	@Override
	public String execute() {
		return figure.getContent();

	}

}
