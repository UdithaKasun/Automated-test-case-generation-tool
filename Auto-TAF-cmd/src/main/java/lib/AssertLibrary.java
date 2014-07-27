package lib;

import java.lang.reflect.Method;

import org.testng.Assert;

public class AssertLibrary {
	public static void main(String[] args) {

		Class<?> s = Assert.class;
		for (Method st : s.getMethods()) {
//			System.out.println(st.getName());
			Class<?>[] cl = st.getParameterTypes();
			String parasTyp = "";
			String paras = "";
			int i = 0;
			for (Class pa : cl) {
//				System.out.print(pa.getSimpleName() + " ");
				paras += "args" + (i) + ", ";
				parasTyp += pa.getSimpleName() + " " + "args" + (i++) + ", ";
			}
			if (paras.length() > 2) {
				paras = paras.substring(0, paras.length() - 3);
				parasTyp = parasTyp.substring(0, parasTyp.length() - 3);
			}

			String me = "public void " + st.getName() + "(" + parasTyp
					+ "){Assert." + st.getName() + "(" + paras + "); }";
			System.out.println(me);
		}
	}

	public void assertNotNull(Object args){Assert.assertNotNull(args); }
	public void assertNotNull(Object args0, String args){Assert.assertNotNull(args0, args); }
	public void fail(String args0, Throwable args){Assert.fail(args0, args); }
	public void fail(String args){Assert.fail(args); }
	public void fail(){Assert.fail(); }
	public void assertTrue(boolean args){Assert.assertTrue(args); }
	public void assertTrue(boolean args0, String args){Assert.assertTrue(args0, args); }
	public void assertEquals(short args0, short args){Assert.assertEquals(args0, args); }
	public void assertEquals(int args0, int args1, String args){Assert.assertEquals(args0, args1, args); }
	public void assertEquals(int args0, int args){Assert.assertEquals(args0, args); }
	public void assertEquals(char args0, char args1, String args){Assert.assertEquals(args0, args1, args); }
	public void assertEquals(short args0, short args1, String args){Assert.assertEquals(args0, args1, args); }
	public void assertEquals(char args0, char args){Assert.assertEquals(args0, args); }
	public void assertEquals(byte args0, byte args){Assert.assertEquals(args0, args); }
	public void assertEquals(Object[] args0, Object[] args){Assert.assertEquals(args0, args); }
	public void assertEquals(Object[] args0, Object[] args1, String args){Assert.assertEquals(args0, args1, args); }
	public void assertEquals(byte[] args0, byte[] args1, String args){Assert.assertEquals(args0, args1, args); }
	public void assertEquals(byte[] args0, byte[] args){Assert.assertEquals(args0, args); }
	public void assertEquals(Object args0, Object args1, String args){Assert.assertEquals(args0, args1, args); }
	public void assertEquals(double args0, double args1, double args2, String args){Assert.assertEquals(args0, args1, args2, args); }
	public void assertEquals(double args0, double args1, double args){Assert.assertEquals(args0, args1, args); }
	public void assertEquals(float args0, float args1, float args2, String args){Assert.assertEquals(args0, args1, args2, args); }
	public void assertEquals(Object args0, Object args){Assert.assertEquals(args0, args); }
	public void assertEquals(String args0, String args){Assert.assertEquals(args0, args); }
	public void assertEquals(String args0, String args1, String args){Assert.assertEquals(args0, args1, args); }
	public void assertEquals(long args0, long args){Assert.assertEquals(args0, args); }
	public void assertEquals(byte args0, byte args1, String args){Assert.assertEquals(args0, args1, args); }
	public void assertEquals(boolean args0, boolean args1, String args){Assert.assertEquals(args0, args1, args); }
	public void assertEquals(boolean args0, boolean args){Assert.assertEquals(args0, args); }
	public void assertEquals(float args0, float args1, float args){Assert.assertEquals(args0, args1, args); }
	public void assertEquals(long args0, long args1, String args){Assert.assertEquals(args0, args1, args); }
	public void assertFalse(boolean args){Assert.assertFalse(args); }
	public void assertFalse(boolean args0, String args){Assert.assertFalse(args0, args); }
	public void assertNull(Object args){Assert.assertNull(args); }
	public void assertNull(Object args0, String args){Assert.assertNull(args0, args); }
	public void assertSame(Object args0, Object args1, String args){Assert.assertSame(args0, args1, args); }
	public void assertSame(Object args0, Object args){Assert.assertSame(args0, args); }
	public void assertNotSame(Object args0, Object args){Assert.assertNotSame(args0, args); }
	public void assertNotSame(Object args0, Object args1, String args){Assert.assertNotSame(args0, args1, args); }
	public void assertEqualsNoOrder(Object[] args0, Object[] args){Assert.assertEqualsNoOrder(args0, args); }
	public void assertEqualsNoOrder(Object[] args0, Object[] args1, String args){Assert.assertEqualsNoOrder(args0, args1, args); }
	public void assertNotEquals(double args0, double args1, double args2, String args){Assert.assertNotEquals(args0, args1, args2, args); }
	public void assertNotEquals(float args0, float args1, float args){Assert.assertNotEquals(args0, args1, args); }
	public void assertNotEquals(float args0, float args1, float args2, String args){Assert.assertNotEquals(args0, args1, args2, args); }
	public void assertNotEquals(Object args0, Object args){Assert.assertNotEquals(args0, args); }
	public void assertNotEquals(Object args0, Object args1, String args){Assert.assertNotEquals(args0, args1, args); }
	public void assertNotEquals(double args0, double args1, double args){Assert.assertNotEquals(args0, args1, args); }
	
	
}
