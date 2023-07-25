//package com.control;
//
//public class HibernateMappingMain {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}

package com.control;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.to.Player;
import com.to.Team;


public class HibernateMappingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration configuration = new Configuration().configure();
		configuration.addAnnotatedClass(com.to.Player.class);
		configuration.addAnnotatedClass(com.to.Team.class);
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		SessionFactory factory = configuration.buildSessionFactory(builder.build());
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
//		Team t1 = new Team("India");
//		Player p1 = new Player("Virat Kohli",t1,28);
//		session.save(t1);
//		session.save(p1);
		Team t1 = new Team("India");
		Team t2 = new Team("RCB");
		Team t3 = new Team("Delhi");
		Player p = new Player();
		p.setPlayerName("Virat Kohli");
		p.setAge(28);
		p.getTeamList().add(t1);
		p.getTeamList().add(t2);
		p.getTeamList().add(t3);
		session.save(t1);
		session.save(t2);
		session.save(t3);
		session.save(p);
		transaction.commit();
		session.close();

	}

}
