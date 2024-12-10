package X;

import android.util.Base64;
import com.whatsapp.util.Log;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1ft  reason: invalid class name and case insensitive filesystem */
public final class C31641ft implements C29951d9 {
    public HashSet A00 = new HashSet();
    public final C18010vc A01;
    public final AtomicBoolean A02 = new AtomicBoolean(false);
    public final C18100vl A03 = new C18110vm(new C31651fu(this));
    public final AnonymousClass1OX A04;

    public C31641ft(C18010vc r3, AnonymousClass1OX r4) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r4, 2);
        this.A01 = r3;
        this.A04 = r4;
    }

    public /* synthetic */ void Brl() {
    }

    public /* synthetic */ void BsQ(C63622tQ r1) {
    }

    public /* synthetic */ void C67(C63622tQ r1) {
    }

    public /* synthetic */ void C69(C63622tQ r1) {
    }

    public final void A00() {
        byte[] decode;
        Iterable iterable;
        C61702q7 r4 = (C61702q7) this.A03.getValue();
        if (!r4.A01.getAndSet(true)) {
            Log.i("PersistedIntStore/load");
            String string = r4.A04.getString("key", (String) null);
            if (string != null && (decode = Base64.decode(string, 0)) != null) {
                int length = decode.length / 4;
                int[] iArr = new int[length];
                ByteBuffer.wrap(decode).asIntBuffer().get(iArr);
                synchronized (r4) {
                    LinkedHashSet linkedHashSet = r4.A00;
                    linkedHashSet.clear();
                    if (length == 0) {
                        iterable = C18460wS.A00;
                    } else {
                        iterable = new C98544rK(iArr, 1);
                    }
                    C29401cD.A0J(iterable, linkedHashSet);
                    r4.A02 = false;
                    StringBuilder sb = new StringBuilder();
                    sb.append("PersistedIntStore/load loaded ");
                    sb.append(linkedHashSet.size());
                    sb.append(" values");
                    Log.i(sb.toString());
                }
            }
        }
    }

    public void C68(C63622tQ r3) {
        Integer num = r3.A09;
        if (num != null) {
            HashSet hashSet = this.A00;
            synchronized (hashSet) {
                hashSet.remove(num);
            }
        }
    }
}
