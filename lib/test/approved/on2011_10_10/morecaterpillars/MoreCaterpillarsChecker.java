package approved.on2011_10_10.morecaterpillars;



import net.egork.utils.io.InputReader;
import net.egork.chelper.task.Test;
import net.egork.chelper.tester.Verdict;

import java.util.Collection;
import java.util.Collections;

public class MoreCaterpillarsChecker {
	public Verdict check(InputReader input, InputReader expected, InputReader actual) {
		return Verdict.UNDECIDED;
	}

	public double getCertainty() {
		return 0;
	}

	public Collection<? extends Test> generateTests() {
		return Collections.emptyList();
	}
}
