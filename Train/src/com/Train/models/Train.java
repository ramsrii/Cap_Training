package com.Train.models;

public class Train {
		int trainNumber;
		String trainName;
		String source;
		String destination;
		int ac1;
		int ac2;
		int ac3;
		int sleeper;
		int seater;
		public Train(int trainNumber, String trainName, String source, String destination, int ac1, int ac2, int ac3,
				int sleeper, int seater) {
			super();
			this.trainNumber = trainNumber;
			this.trainName = trainName;
			this.source = source;
			this.destination = destination;
			this.ac1 = ac1;
			this.ac2 = ac2;
			this.ac3 = ac3;
			this.sleeper = sleeper;
			this.seater = seater;
		}
		public Train() {
			// TODO Auto-generated constructor stub
		}
		public int getTrainNumber() {
			return trainNumber;
		}
		public void setTrainNumber(int trainNumber) {
			this.trainNumber = trainNumber;
		}
		public String getTrainName() {
			return trainName;
		}
		public void setTrainName(String trainName) {
			this.trainName = trainName;
		}
		public String getSource() {
			return source;
		}
		public void setSource(String source) {
			this.source = source;
		}
		public String getDestination() {
			return destination;
		}
		public void setDestination(String destination) {
			this.destination = destination;
		}
		public int getAc1() {
			return ac1;
		}
		public void setAc1(int ac1) {
			this.ac1 = ac1;
		}
		public int getAc2() {
			return ac2;
		}
		public void setAc2(int ac2) {
			this.ac2 = ac2;
		}
		public int getAc3() {
			return ac3;
		}
		public void setAc3(int ac3) {
			this.ac3 = ac3;
		}
		public int getSleeper() {
			return sleeper;
		}
		public void setSleeper(int sleeper) {
			this.sleeper = sleeper;
		}
		public int getSeater() {
			return seater;
		}
		public void setSeater(int seater) {
			this.seater = seater;
		}
		@Override
		public String toString() {
			return "\nTrain [trainNumber=" + trainNumber + ", trainName=" + trainName + ", source=" + source
					+ ", destination=" + destination + ", ac1=" + ac1 + ", ac2=" + ac2 + ", ac3=" + ac3 + ", sleeper="
					+ sleeper + ", seater=" + seater + "]";
		}
		
	}

