package Concrete;

import java.util.ArrayList;
import java.util.Scanner;

import Abstract.CommentManagerInterface;
import Entities.Comment;
import Entities.Game;
import Entities.Gamer;

public class CommentManager implements CommentManagerInterface{

	@Override
	public void addComment(Gamer gamer, Game game, Comment comment) {
		System.out.println("Yorum eklendi");
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " isimli oyuncu "
							+ game.getName() + " icin yorum yapti");
		System.out.println("Eklenen yorumun detaylari: ");
		showCommentProperties(comment);
	}

	@Override
	public void deleteComment(Gamer gamer, Game game, Comment comment) {
		System.out.println("Yorum silindi");
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " isimli oyuncu "
							+ game.getName() + " icin yorumunu kaldirdi");
		System.out.println("Silinen yorumun detaylari: ");
		showCommentProperties(comment);
	}

	@Override
	public void updateComment(Comment comment) {
		Scanner scanner = new Scanner(System.in);
		int operation;
		boolean goOn = true;
		while(goOn) {
			System.out.println("Yorumda guncellenecek alani seciniz:");
			System.out.print("\t1. Name"
								+ "\n\t2. Title"
								+ "\n\t3. Content"
								+ "\n\t4. Tags"
								+ "\n\t5. Guncellemeden cikmak icin 5'i seciniz"
								+ "Isleminiz: ");
			operation = scanner.nextInt();
			scanner.nextLine();
			switch(operation) {
				case 1:
					System.out.print("Guncelleme name: " + comment.getName()
										+ "\nYeni name: ");
					comment.setName(scanner.nextLine());
					System.out.println("Guncel name: " + comment.getName());
					break;
				case 2:
					System.out.print("Guncelleme title: " + comment.getTitle()
										+ "\nYeni title: ");
					comment.setTitle(scanner.nextLine());
					System.out.println("Guncel title: " + comment.getTitle());
					break;
				case 3:
					System.out.print("Guncelleme content: " + comment.getContent()
										+ "\nYeni content: ");
					comment.setContent(scanner.nextLine());
					System.out.println("Guncel content: " + comment.getContent());
					break;
				case 4:
					System.out.print("Guncelleme tags: " + comment.getTags()
										+ "\nYeni tags: ");
					ArrayList<String> tag = comment.getTags();
					tag.clear();
					for(int i = 0; i < comment.getTags().size(); i++) {
						tag.add(scanner.nextLine());
					}
					comment.setTags(tag);
					System.out.println("Guncel tags: " + comment.getTags());
					break;
				case 5:
					goOn = false;
					System.out.println("Guncellemeden cikis yapiliyor");
					break;
				default:
					System.out.println("Gecerli bir islem giriniz");
			}
		}
	}

	@Override
	public void showCommentProperties(Comment comment) {
		System.out.println("\tYorum name: " + comment.getName()
							+"\n\tYorum title: " + comment.getTitle()
							+"\n\tYorum content: " + comment.getContent()
							+"\n\tYorum tags: " + comment.getTags());
	}
}
