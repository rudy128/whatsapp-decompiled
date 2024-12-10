package com.whatsapp.newsletter.mex;

import X.AnonymousClass10E;
import X.AnonymousClass1CJ;
import X.AnonymousClass1M9;
import X.AnonymousClass1PY;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BX;
import X.C179519Ih;
import X.C20131A8r;
import X.C22515BAy;
import X.C24791Lr;
import X.C29681ch;
import X.C32991i5;
import X.C35681md;
import android.content.Context;
import com.whatsapp.newsletter.iq.BaseNewslettersJob;

public final class UpdateNewsletterGraphqlJob extends BaseNewslettersJob {
    public transient AnonymousClass1M9 A00;
    public transient C24791Lr A01;
    public transient C32991i5 A02;
    public transient AnonymousClass1PY A03;
    public transient C35681md A04;
    public transient C20131A8r A05;
    public transient AnonymousClass1CJ A06;
    public C22515BAy callback;
    public final String description;
    public final String name;
    public final C29681ch newsletterJid;
    public final C179519Ih newsletterReactionSettings;
    public final byte[] picture;
    public final boolean updateDescription;
    public final boolean updateName;
    public final boolean updatePicture;
    public final boolean updateReactionSetting;

    public void cancel() {
        this.isCancelled = true;
        this.callback = null;
    }

    public UpdateNewsletterGraphqlJob(C179519Ih r2, C29681ch r3, C22515BAy bAy, String str, String str2, byte[] bArr, boolean z, boolean z2, boolean z3, boolean z4) {
        super("GetNewsletterMetadataJob");
        this.newsletterJid = r3;
        this.name = str;
        this.description = str2;
        this.picture = bArr;
        this.newsletterReactionSettings = r2;
        this.updateName = z;
        this.updateDescription = z2;
        this.updatePicture = z3;
        this.updateReactionSetting = z4;
        this.callback = bAy;
    }

    public void CIZ(Context context) {
        AnonymousClass10E r1 = (AnonymousClass10E) AnonymousClass8BX.A0H(context);
        this.A06 = AnonymousClass3Ma.A0d(r1);
        this.A00 = AnonymousClass10E.A4z(r1);
        this.A02 = AnonymousClass8BU.A0G(r1);
        this.A03 = AnonymousClass3Ma.A0l(r1);
        this.A04 = (C35681md) r1.A7N.get();
        this.A01 = (C24791Lr) r1.A2h.get();
        this.A05 = AnonymousClass8BT.A0P(r1);
    }
}
