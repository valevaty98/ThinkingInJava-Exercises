package HidingTheImplementationChapter6;

import static HidingTheImplementationChapter6.debug.Deb.debug;
import static HidingTheImplementationChapter6.debugoff.Deb.debug;

import HidingTheImplementationChapter6.access.Widget;
import HidingTheImplementationChapter6.debugoff.Deb;
import HidingTheImplementationChapter6.task.Task;

//Ex. 1
public class TaskCreater {
    public static void main(String[] args) {
        Task task = new Task();
        debug("Hello");
        debug();

        Deb deb = new Deb();
        System.out.println(deb.pub);
        Widget widg = new Widget();
    }
}
