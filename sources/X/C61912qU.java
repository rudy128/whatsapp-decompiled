package X;

import java.util.LinkedList;

/* renamed from: X.2qU  reason: invalid class name and case insensitive filesystem */
public class C61912qU {
    public LinkedList A00 = new LinkedList();

    public C199019zI A00() {
        LinkedList linkedList = this.A00;
        if (!linkedList.isEmpty()) {
            return (C199019zI) linkedList.get(0);
        }
        throw new AnonymousClass1P9("No key state in record!");
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, X.9zI] */
    public C61912qU(byte[] bArr) {
        for (C165118ac r2 : ((AnonymousClass8XP) C23577Bm6.A07(AnonymousClass8XP.DEFAULT_INSTANCE, bArr)).senderKeyStates_) {
            LinkedList linkedList = this.A00;
            ? obj = new Object();
            obj.A00 = r2;
            linkedList.add(obj);
        }
    }

    public C61912qU() {
    }
}
