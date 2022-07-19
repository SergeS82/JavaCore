package graduationProject.area;

public abstract class Action implements Runnable{
    protected final String actionName;

    public Action(String actionName) {
        this.actionName = actionName;
    }

    public String getActionName() {
        return actionName;
    }
}
