package Composition;

import java.util.ArrayList;

public class Folder {
    private String folderName;
    private ArrayList<Folder> folderList;
    private ArrayList<File> fileList;

    public Folder(String folderName)
    {
        this.folderName=folderName;
        this.folderList=new ArrayList<>();
        this.fileList=new ArrayList<>();
    }

    public void setFolderName(String folderName)
    {
        this.folderName = folderName;
    }

    public void addToFolderList(String folderName)
    {
        this.folderList.add(new Folder(folderName));
    }
    public void addToFileList(String fileName)
    {
        this.fileList.add(new File(fileName));
    }
    public void removeIndividualFolder(int index)
    {
        folderList.remove(index);
    }
    public void removeAllFolder() {
        folderList=new ArrayList<>();
    }
    public void removeIndividualFile(int index)
    {
        fileList.remove(index);
    }
    public void removeAllFile()
    {
        fileList=new ArrayList<>();
    }
    public String getFolderName()
    {
        return folderName;
    }
    public Folder getIndividualFolder(int index)
    {
        return folderList.get(index);
    }
    public ArrayList<Folder> getFolderList()
    {
        return folderList;
    }

    public File getIndividualFile(int index)
    {
        return fileList.get(index);
    }

    public ArrayList<File> getFileList()
    {
        return fileList;
    }



    public void structurePrintout()
    {
        if(folderList.size()>0)
        {
            System.out.print("- ");
        }
        else
        {
            System.out.print("+ ");
        }
        structurePrintoutHelper(0);
    }
    private void structurePrintoutHelper (int tab)
    {
        System.out.println(folderName);


        for(int i=0;i<folderList.size();i++)
        {
            System.out.print("| ");
            for(int j=0;j<tab;j++)
            {
                System.out.print("\t| ");
            }
            if(folderList.get(i).getFolderList().size()>0)
            {
                System.out.print("\t- ");
            }
            else
            {
                System.out.print("\t+ ");
            }
            folderList.get(i).structurePrintoutHelper(tab+1);
        }
        for(int i=0;i<fileList.size();i++)
        {
            System.out.print("| ");

            for(int j=0;j<tab;j++)
            {
                System.out.print("\t| ");
            }
            System.out.println(fileList.get(i));
        }
    }
}
