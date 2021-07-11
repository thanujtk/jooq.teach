package jooq.examples.tools;

import org.jooq.ExecuteContext;
import org.jooq.impl.DefaultExecuteListener;
import org.jooq.tools.StopWatch;

/*
 * Just hook a simple execute listener into your jOOQ Configuration
 */
public class QueryPerformanceListener extends DefaultExecuteListener {

    //https://www.jooq.org/doc/3.15/manual/getting-started/use-cases/jooq-for-pros/

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    StopWatch watch;

    @Override
    public void executeStart(ExecuteContext ctx) {
        super.executeStart(ctx);
        watch = new StopWatch();
    }

    @Override
    public void executeEnd(ExecuteContext ctx) {

        super.executeEnd(ctx);
        System.out.println("Performance of SQL \n"
                + ctx.query() + "\n took " + StopWatch.format(watch.split()));
    }
}