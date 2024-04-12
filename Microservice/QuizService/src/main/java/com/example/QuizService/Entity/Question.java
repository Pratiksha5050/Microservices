package com.example.QuizService.Entity;




public class Question {
		private Long questionid;
		private String question;
		private Long quizId;
		
		public Question(Long questionid, String question, Long quizId) {
			super();
			this.questionid = questionid;
			this.question = question;
			this.quizId = quizId;
		}
		public Long getQuizId() {
			return quizId;
		}
		public void setQuizId(Long quizId) {
			this.quizId = quizId;
		}
		public Long getQuestionid() {
			return questionid;
		}
		public void setQuestionid(Long questionid) {
			this.questionid = questionid;
		}
		public String getQuestion() {
			return question;
		}
		public void setQuestion(String question) {
			this.question = question;
		}
		
		public Question() {
			super();
		}
		
}
