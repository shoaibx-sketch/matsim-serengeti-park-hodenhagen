package org.matsim.analysis;

import org.matsim.core.events.EventsUtils;

public class StartAnalysis {

    public static void main(String[] args) {

        var handler = new LinkCOunterHandler();
        var manager = EventsUtils.createEventsManager();
        manager.addHandler(handler);
        EventsUtils.readEvents(manager, "C:\\Users\\shoaib\\IdeaProjects\\matsim-serengeti-park-hodenhagen\\scenarios\\serengeti-park-v1.0\\output\\output-serengeti-park-v1.0-run1\\serengeti-park-v1.0-run1.output_events.xml.gz");

        System.out.println(handler.counter);
    }
}
