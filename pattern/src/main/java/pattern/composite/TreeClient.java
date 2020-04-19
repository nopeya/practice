package pattern.composite;

public class TreeClient {

    public static void main(String[] args) {
        Node root = new Node("根目录", 0);

        Node video = new Node("视频", 1);
        Node music = new Node("音频", 1);
        root.addChild(video);
        root.addChild(music);

        LeafNode video1 = new LeafNode("小丑.mp4", 2);
        LeafNode video2 = new LeafNode("1998.mp4", 2);
        video.addChild(video1);
        video.addChild(video2);

        LeafNode music1 = new LeafNode("人生浪费指南.mp3", 2);
        LeafNode music2 = new LeafNode("骊歌.mp3", 2);
        music.addChild(music1);
        music.addChild(music2);

        LeafNode noGroup1 = new LeafNode("未分类文件1.exe", 1);
        LeafNode noGroup2 = new LeafNode("未分类图片2.png", 1);
        root.addChild(noGroup1);
        root.addChild(noGroup2);

        root.print();
    }
}
