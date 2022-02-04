package incrementer;

import incrementer.service.impl.PathProcessorImpl;

public class Main {

    public static void main(String[] args) {
        PathProcessorImpl pathProcessorImpl = new PathProcessorImpl();
        pathProcessorImpl.process(args[0]);
    }
}
