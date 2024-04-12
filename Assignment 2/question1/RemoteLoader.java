//Name: Ashammeet Gill #3147996
package headfirst.command.undo;

public class RemoteLoader {
 
	public static void main(String[] args) {
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

		CeilingFan ceilingFan = new CeilingFan("Living Room");
		
		CeilingFanLowCommand ceilingFanLow = 
				new CeilingFanLowCommand(ceilingFan);
		CeilingFanMediumCommand ceilingFanMedium = 
				new CeilingFanMediumCommand(ceilingFan);
		CeilingFanHighCommand ceilingFanHigh = 
				new CeilingFanHighCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = 
				new CeilingFanOffCommand(ceilingFan);
  
		remoteControl.setCommand(0, ceilingFanLow, ceilingFanOff);
		remoteControl.setCommand(1, ceilingFanMedium, ceilingFanOff);
		remoteControl.setCommand(2, ceilingFanHigh, ceilingFanOff);
		
		System.out.println("\nCeiling Fan commands:");
		remoteControl.onButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);

		System.out.println("\nUndo commands");
		remoteControl.undoButtonWasPushed();
		remoteControl.undoButtonWasPushed();

		System.out.println("\nRedo Commands");
		remoteControl.redoButtonWasPushed();
		remoteControl.redoButtonWasPushed();
	}
}
