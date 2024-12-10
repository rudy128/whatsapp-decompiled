package X;

import android.widget.AbsListView;
import com.whatsapp.group.GroupParticipantsSearchFragment;

/* renamed from: X.4ec  reason: invalid class name and case insensitive filesystem */
public class C90774ec implements AbsListView.OnScrollListener {
    public int A00;
    public final int A01;
    public final Object A02;

    public C90774ec(Object obj, int i) {
        this.A01 = i;
        this.A02 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScrollStateChanged(android.widget.AbsListView r2, int r3) {
        /*
            r1 = this;
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x0038;
                case 1: goto L_0x002b;
                case 2: goto L_0x001e;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            int r0 = r1.A00
            if (r0 != 0) goto L_0x004d
            if (r3 == r0) goto L_0x004d
            java.lang.Object r0 = r1.A02
            com.whatsapp.newsletter.NewsletterInfoMembersSearchFragment r0 = (com.whatsapp.newsletter.NewsletterInfoMembersSearchFragment) r0
            X.1L4 r0 = r0.A08
            if (r0 != 0) goto L_0x004a
            java.lang.String r0 = "imeUtils"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x001e:
            int r0 = r1.A00
            if (r0 != 0) goto L_0x004d
            if (r3 == r0) goto L_0x004d
            java.lang.Object r0 = r1.A02
            com.whatsapp.group.GroupParticipantsSearchFragment r0 = (com.whatsapp.group.GroupParticipantsSearchFragment) r0
            X.1L4 r0 = r0.A08
            goto L_0x004a
        L_0x002b:
            int r0 = r1.A00
            if (r0 != 0) goto L_0x004d
            if (r3 == r0) goto L_0x004d
            java.lang.Object r0 = r1.A02
            X.1FY r0 = (X.AnonymousClass1FY) r0
            X.1L4 r0 = r0.A09
            goto L_0x004a
        L_0x0038:
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            int r0 = r1.A00
            if (r0 != 0) goto L_0x004d
            if (r3 == r0) goto L_0x004d
            java.lang.Object r0 = r1.A02
            com.whatsapp.contact.picker.BidiContactListView r0 = (com.whatsapp.contact.picker.BidiContactListView) r0
            X.1L4 r0 = r0.getImeUtils()
        L_0x004a:
            r0.A01(r2)
        L_0x004d:
            r1.A00 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90774ec.onScrollStateChanged(android.widget.AbsListView, int):void");
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public C90774ec(GroupParticipantsSearchFragment groupParticipantsSearchFragment) {
        this.A01 = 2;
        this.A02 = groupParticipantsSearchFragment;
        this.A00 = 0;
    }

    public C90774ec(AnonymousClass3gf r2) {
        this.A01 = 1;
        this.A02 = r2;
        this.A00 = 0;
    }
}
