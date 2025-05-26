import javax.swing.event.MenuEvent;
import java.util.EventListener;

public interface MenuBarListener extends EventListener {

    void menuBarEventOccurred(String itemActionCommand);

}
