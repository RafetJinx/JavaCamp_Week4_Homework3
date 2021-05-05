package Abstract;

import Entities.Comment;
import Entities.Game;
import Entities.Gamer;

public interface CommentManagerInterface {
	void addComment(Gamer gamer, Game game, Comment comment);
	
	void deleteComment(Gamer gamer, Game game, Comment comment);
	
	void updateComment(Comment comment);
	
	void showCommentProperties(Comment comment);
}
