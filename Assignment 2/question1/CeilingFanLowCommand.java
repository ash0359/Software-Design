//Name: Ashammeet Gill #3147996
package headfirst.command.undo;

public class CeilingFanLowCommand implements Command {
	CeilingFan ceilingFan;
	int prevSpeed;
  
	public CeilingFanLowCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
 
	public void execute() {
		this.prevSpeed = this.ceilingFan.getSpeed();
		this.ceilingFan.low();
	}
 
	public void undo() {
		if (this.prevSpeed == CeilingFan.HIGH) {
			this.ceilingFan.high();
		} else if (this.prevSpeed == CeilingFan.MEDIUM) {
			this.ceilingFan.medium();
		} else if (this.prevSpeed == CeilingFan.LOW) {
			this.ceilingFan.low();
		} else if (this.prevSpeed == CeilingFan.OFF) {
			this.ceilingFan.off();
		}
	}
}
