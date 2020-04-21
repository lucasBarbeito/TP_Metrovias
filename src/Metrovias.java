public class Metrovias {

    Window[] windows;

    public Metrovias(int amountOfWindows) {
        windows = new Window[amountOfWindows];
        for (int i = 0; i < windows.length; i++) {
            windows[i] = new Window();
        }
    }


}
