import java.util.Comparator;

public class DurationComparator implements Comparator<Call>{

	@Override
	public int compare(Call o1, Call o2) {
		if(o1.getDuration() == o2.getDuration())
			return 0;
		else if(o1.getDuration() > o2.getDuration())
			return 1;
		else
			return -1;
	}

}
