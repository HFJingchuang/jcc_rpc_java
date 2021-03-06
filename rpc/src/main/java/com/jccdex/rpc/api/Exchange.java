package com.jccdex.rpc.api;

import com.jccdex.rpc.base.JCallback;

public interface Exchange {

	void requestBalance(String address, JCallback callback);

	void requestHistoricTransactions(String address, int ledger, int seq, JCallback callback);

	void requestOrders(String address, int page, JCallback callback);

	void createOrder(String signature, JCallback callback);

	void cancelOrder(String signature, JCallback callback);

	int requestSequence(String address);

	void transferToken(String signature, JCallback callback);
	
	void requestOrderDetail(String hash, JCallback callback);
}
