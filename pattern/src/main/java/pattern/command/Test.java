package pattern.command;

public class Test {

    public static void main(String[] args) {
        CommcandRunner commcandRunner = new CommcandRunner();
        Editor editor = new EditorImpl();
        String data1 = "data1";
        String data2 = "data2";
//        commcandRunner.run(new OpenCommand(editor));
//        commcandRunner.run(new WriteCommand(editor, data1));
//        commcandRunner.run(new SaveCommand(editor));

        commcandRunner.run(() -> editor.open());
        commcandRunner.run(() -> editor.write(data2));
        commcandRunner.run(() -> editor.save());
        System.out.println(commcandRunner.countCommand());
        commcandRunner.redo();
    }
}
