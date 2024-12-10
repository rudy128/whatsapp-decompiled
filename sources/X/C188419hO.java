package X;

import java.util.Collection;
import java.util.List;

/* renamed from: X.9hO  reason: invalid class name and case insensitive filesystem */
public abstract class C188419hO {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public Integer A06;
    public Collection A07;
    public List A08;
    public boolean A09;

    public /* synthetic */ C188419hO(Integer num, List list, int i, int i2, int i3, long j, long j2, boolean z) {
        boolean z2 = z;
        List list2 = null;
        int i4 = (i3 & 32) != 0 ? 32 : 0;
        int i5 = (i3 & 64) != 0 ? 32 : 0;
        i2 = (i3 & 128) != 0 ? 5 : i2;
        z2 = (i3 & 256) != 0 ? false : z2;
        if ((i3 & 512) != 0) {
            AnonymousClass9IL[] r5 = new AnonymousClass9IL[3];
            r5[0] = AnonymousClass9IL.LGC_MEMBERS;
            r5[1] = AnonymousClass9IL.GROUP_CHAT_MEMBERS;
            list2 = C18070vi.A0O(AnonymousClass9IL.FAVORITE_GROUP_CHAT_MEMBERS, r5, 2);
        }
        C18070vi.A0d(list2, 10);
        this.A06 = num;
        this.A00 = i;
        this.A04 = j;
        this.A05 = j2;
        this.A08 = list;
        this.A01 = i4;
        this.A02 = i5;
        this.A03 = i2;
        this.A09 = z2;
        this.A07 = list2;
    }
}
