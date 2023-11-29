package vladyslav.goit;

import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

public class MBeanServer {

    public void mBeanServer () throws Exception{
        javax.management.MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
        ObjectName mbeanName = new ObjectName("vladyslav.goit:type=LoggingControl");
        LoggingControl mbean = new LoggingControl();
        mbs.registerMBean(mbean, mbeanName);
        System.out.println("Logging control MBean registered.");
        System.in.read();
    }
}
