package com.niit.project2.DAO;
import java.util.List;
import org.springframework.stereotype.Repository;

import com.niit.project2.Model.CardDetail;
import com.niit.project2.Model.Category;
@Repository
public interface CardDetailDAO {

	public void saveOrUpdate(CardDetail cardDetail);
	public void delete(String cardDetailId);

	public Category getCardDetailByCustomerid(String customerid);
	public List<CardDetail> list();
	public void save(CardDetail cardDetail);
	}

