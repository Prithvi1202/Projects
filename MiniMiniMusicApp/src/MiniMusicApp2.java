
import javax.sound.midi.*;
public class MiniMusicApp2 implements ControllerEventListener {
	public static void main(String[] args){
		MiniMusicApp2 mini = new MiniMusicApp2();
		mini.go();
	}
		public void go(){
		try{
			Sequencer sequencer = MidiSystem.getSequencer();
			sequencer.open();
			
			int[] eventsIwant = {127};
			sequencer.addControllerEventListener(this, eventsIwant);
			Sequence seq = new Sequence(Sequence.PPQ, 4);
			Track track = seq.createTrack();
			
			for (int i = 5; i < 61; i+= 4){
				track .add(makeEvent(144,1,i,100,i));
				track .add(makeEvent(176,1,127,0,i));
				track.add(makeEvent(128,1,i,100,i + 2));
			}
			sequencer.setSequence(seq);
			sequencer.setTempoInBPM(220);
			sequencer.start();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	

	private static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
		// TODO Auto-generated method stub
		MidiEvent event = null;
		try{
			ShortMessage a = new ShortMessage();
			a.setMessage(comd, chan, one , two);
			event = new MidiEvent(a, tick);
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		
		return event;
	}
	@Override
	public void controlChange(ShortMessage event) {
		// TODO Auto-generated method stub
		System.out.println("la");
	}
}
