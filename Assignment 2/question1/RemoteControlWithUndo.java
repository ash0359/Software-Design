//Name: Ashammeet Gill #3147996
package headfirst.command.undo;

import java.util.*;

//
// This is the invoker
//
public class RemoteControlWithUndo {
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;
	Stack<Command> undo = new Stack<>();
	Stack<Command> redo = new Stack<>();
 
	public RemoteControlWithUndo() 
	{
		this.onCommands = new Command[7];
		this.offCommands = new Command[7];
 
		Command noCommand = new NoCommand();
		for(int i=0;i<7;i++) {
			this.onCommands[i] = noCommand;
			this.offCommands[i] = noCommand;
		}
		this.undoCommand = noCommand;
	}
  
	public void setCommand(int slot, Command onCommand, Command offCommand) 
	{
		this.onCommands[slot] = onCommand;
		this.offCommands[slot] = offCommand;
	}
 
	public void onButtonWasPushed(int slot) 
	{
		this.onCommands[slot].execute();
		this.undoCommand = this.onCommands[slot];
		this.undo.push(this.undoCommand);
	}
 
	public void offButtonWasPushed(int slot) 
	{
		this.offCommands[slot].execute();
		this.undoCommand = this.offCommands[slot];
		this.undo.push(this.undoCommand);
	}
 
	public void undoButtonWasPushed() 
	{
		this.redo.push(this.undo.pop());
		this.undo.peek().execute();
	}

	public void redoButtonWasPushed() 
	{
		
		//this.undoCommand.undo();
		this.redo.peek().execute();
		this.undo.push(this.redo.pop());
	}
	
	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------ Remote Control -------\n");
		for (int i = 0; i < this.onCommands.length; i++) {
			stringBuff.append("[slot " + i + "] " + this.onCommands[i].getClass().getName()
				+ "    " + this.offCommands[i].getClass().getName() + "\n");
		}
		stringBuff.append("[undo] " + this.undoCommand.getClass().getName() + "\n");
		return stringBuff.toString();
	}
}