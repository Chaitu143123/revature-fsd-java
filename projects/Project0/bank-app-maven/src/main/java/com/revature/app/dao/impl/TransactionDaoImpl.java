package com.revature.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import om.revature.app.dao.TransactionDao;
import om.revature.app.dao.Util;

public class TransactionDaoImpl implements TransactionDao {

	private static final int Id = 0;

	@Override
	public void performWithdrawl(long accountId, long money) throws SQLException {
		try (Connection connection = Util.getConnection()) {

			String sql = "update newbankapp.account set balance = ? where id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			int amount = 0;
			preparedStatement.setInt(1, (int) amount);
			preparedStatement.setInt(2, (int) Id);
			preparedStatement.executeUpdate();
			
			connection.close();

		}

		}
	@Override
	public void performDeposit(long accountId, long money) throws SQLException {
		try (Connection connection = Util.getConnection()) {

			String sql = "update newbankapp.account set balance = ? where id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			int amount=0;
			preparedStatement.setInt(1, (int) amount);
			preparedStatement.setInt(2, (int) Id);
			preparedStatement.executeUpdate();
			
			connection.close();

		}
		
	}

	@Override
	public long showBalance(long accountId) throws SQLException {
		long balanceReturned = 0;
		try (Connection connection = Util.getConnection()) {

			String sql = "select balance from account where id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1,(int)Id);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				balanceReturned = (long) rs.getInt("balance");

		}
		return balanceReturned;

	}

	}
}

	
	


