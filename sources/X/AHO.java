package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import java.util.Iterator;

public final class AHO implements B6Z {
    public void C16(BE3 be3) {
        long A06;
        int byteValue;
        double A00;
        String str;
        be3.BKj("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", C108955ca.A0m());
        Object[] objArr = new Object[0];
        AHQ ahq = (AHQ) be3;
        if (contentValues.size() != 0) {
            int size = contentValues.size();
            int i = 0 + size;
            Object[] objArr2 = new Object[i];
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("UPDATE ");
            A10.append(AHQ.A02[3]);
            A10.append("WorkSpec");
            A10.append(" SET ");
            Iterator<String> it = contentValues.keySet().iterator();
            int i2 = 0;
            while (it.hasNext()) {
                String A0v = C17880vN.A0v(it);
                if (i2 > 0) {
                    str = ",";
                } else {
                    str = "";
                }
                A10.append(str);
                A10.append(A0v);
                objArr2[i2] = contentValues.get(A0v);
                A10.append("=?");
                i2++;
            }
            for (int i3 = size; i3 < i; i3++) {
                objArr2[i3] = objArr[i3 - size];
            }
            if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
                A10.append(" WHERE ");
                A10.append("last_enqueue_time = 0 AND interval_duration <> 0 ");
            }
            SQLiteStatement compileStatement = ahq.A00.compileStatement(C18070vi.A0H(A10));
            C18070vi.A0X(compileStatement);
            C162128Jb r3 = new C162128Jb(compileStatement);
            int i4 = 0;
            while (i4 < i) {
                Object obj = objArr2[i4];
                i4++;
                if (obj == null) {
                    r3.BDA(i4);
                } else if (obj instanceof byte[]) {
                    r3.BD5(i4, (byte[]) obj);
                } else {
                    if (obj instanceof Float) {
                        A00 = (double) AnonymousClass000.A04(obj);
                    } else if (obj instanceof Double) {
                        A00 = AnonymousClass8BR.A00(obj);
                    } else {
                        if (obj instanceof Long) {
                            A06 = C17880vN.A05(obj);
                        } else {
                            if (obj instanceof Integer) {
                                byteValue = AnonymousClass000.A0M(obj);
                            } else if (obj instanceof Short) {
                                byteValue = ((Number) obj).shortValue();
                            } else if (obj instanceof Byte) {
                                byteValue = ((Number) obj).byteValue();
                            } else if (obj instanceof String) {
                                r3.BDB(i4, (String) obj);
                            } else if (obj instanceof Boolean) {
                                A06 = AnonymousClass8BX.A06(AnonymousClass000.A1Y(obj) ? 1 : 0);
                            } else {
                                StringBuilder A102 = AnonymousClass000.A10();
                                A102.append("Cannot bind ");
                                A102.append(obj);
                                A102.append(" at index ");
                                A102.append(i4);
                                throw AnonymousClass001.A12(" Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String", A102);
                            }
                            A06 = (long) byteValue;
                        }
                        r3.BD9(i4, A06);
                    }
                    r3.A00.bindDouble(i4, A00);
                }
            }
            r3.A00.executeUpdateDelete();
            return;
        }
        throw AnonymousClass000.A0k("Empty values");
    }
}
