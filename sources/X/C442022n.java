package X;

import com.whatsapp.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.22n  reason: invalid class name and case insensitive filesystem */
public class C442022n extends AnonymousClass206 {
    public String A00;
    public List A01;
    public List A02;

    public C442022n(AnonymousClass205 r2, long j) {
        super(r2, 14, j);
        this.A02 = 1;
    }

    public List A17() {
        ObjectInputStream objectInputStream;
        List list = this.A02;
        if (list == null) {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(A12());
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    list = new ArrayList((List) objectInputStream.readObject());
                    objectInputStream.close();
                    byteArrayInputStream.close();
                } catch (Throwable th) {
                    byteArrayInputStream.close();
                    throw th;
                }
            } catch (IOException | ClassNotFoundException | NullPointerException e) {
                Log.e("ContactUtil/getContactsFromBytes/error getting contacts from data", e);
                list = new ArrayList();
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
            }
            this.A02 = list;
        }
        return list;
        throw th;
    }

    public void A18(List list) {
        this.A02 = new ArrayList(list);
        this.A01 = null;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new ObjectOutputStream(byteArrayOutputStream).writeObject(this.A02);
            A0o(byteArrayOutputStream.toByteArray());
        } catch (IOException unused) {
            throw new AssertionError("ObjectOutputStream backed by ByteArrayOutputStream should not throw IOException");
        }
    }
}
