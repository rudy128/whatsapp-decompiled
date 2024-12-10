package X;

import com.whatsapp.payments.PaymentConfiguration;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: X.8oy  reason: invalid class name and case insensitive filesystem */
public class C170248oy extends AnonymousClass9BT {
    public final AnonymousClass1KH A00;
    public final String A01;
    public final Set A02;

    public C170248oy(C22442B7y b7y, AnonymousClass1KH r4, PaymentConfiguration paymentConfiguration, AnonymousClass10I r6, String str, List list) {
        super(b7y, r4, paymentConfiguration, r6);
        this.A00 = r4;
        TreeSet treeSet = new TreeSet(new C21486Akr(21));
        this.A02 = treeSet;
        treeSet.addAll(list);
        this.A01 = str;
    }
}
