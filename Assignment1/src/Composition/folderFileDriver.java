package Composition;

public class folderFileDriver {
    public static void main(String[] args) {
        Folder demo1= new Folder("demo1");
        demo1.addToFolderList("Source Files");
        demo1.addToFolderList("Include Path");
        demo1.addToFolderList("Remote Files");
        demo1.getIndividualFolder(0).addToFolderList(".phalcon");
        demo1.getIndividualFolder(0).addToFolderList("app");

        demo1.getIndividualFolder(0).getIndividualFolder(1).addToFolderList("config");
        demo1.getIndividualFolder(0).getIndividualFolder(1).addToFolderList("controllers");
        demo1.getIndividualFolder(0).getIndividualFolder(1).addToFolderList("library");
        demo1.getIndividualFolder(0).getIndividualFolder(1).addToFolderList("migrations");
        demo1.getIndividualFolder(0).getIndividualFolder(1).addToFolderList("models");
        demo1.getIndividualFolder(0).getIndividualFolder(1).addToFolderList("views");

        demo1.getIndividualFolder(0).addToFolderList(".cache");
        demo1.getIndividualFolder(0).addToFolderList("public");

        demo1.getIndividualFolder(0).getIndividualFolder(3).addToFileList(".htaccess");
        demo1.getIndividualFolder(0).getIndividualFolder(3).addToFileList(".htrouter.php");
        demo1.getIndividualFolder(0).getIndividualFolder(3).addToFileList("index.html");
        //Code to Remove app Folder
//        demo1.getIndividualFolder(0).removeIndividualFolder(1);
        //Code to Remove public Folder
//        demo1.getIndividualFolder(0).removeIndividualFolder(3);
        demo1.structurePrintout();

    }
}
