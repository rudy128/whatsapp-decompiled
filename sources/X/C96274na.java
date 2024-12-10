package X;

import com.whatsapp.community.LinkExistingGroups;

/* renamed from: X.4na  reason: invalid class name and case insensitive filesystem */
public final class C96274na implements C107495Zx {
    public final /* synthetic */ LinkExistingGroups A00;
    public final /* synthetic */ AnonymousClass1EC A01;

    public C96274na(LinkExistingGroups linkExistingGroups, AnonymousClass1EC r2) {
        this.A00 = linkExistingGroups;
        this.A01 = r2;
    }

    public void BpM(boolean z) {
        if (z) {
            LinkExistingGroups linkExistingGroups = this.A00;
            AnonymousClass1M9 r0 = linkExistingGroups.A06;
            AnonymousClass1EC r3 = this.A01;
            linkExistingGroups.runOnUiThread(new C70773Cl(linkExistingGroups, r3, r0.A0H(r3), 0));
        }
    }
}
