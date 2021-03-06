package com.conga.tools.mokol;

import com.conga.tools.mokol.ShellException;
import com.conga.tools.mokol.spi.Command;

/**
 *
 * @author Todd Fast
 */
public abstract class CommandFactory {

	/**
	 *
	 *
	 */
	public abstract Class<? extends Command> getCommandClass(
		CommandContext context);


	/**
	 *
	 *
	 */
	public abstract Command newInstance(CommandContext context)
		throws ShellException;
}
