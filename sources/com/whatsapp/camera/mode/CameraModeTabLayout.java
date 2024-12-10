package com.whatsapp.camera.mode;

import X.AnonymousClass00H;
import X.AnonymousClass6IX;
import X.C136836uU;
import X.C145787Mp;
import X.C1594884s;
import X.C18070vi;
import android.content.Context;
import android.util.AttributeSet;

public final class CameraModeTabLayout extends AnonymousClass6IX {
    public C136836uU A00;
    public C1594884s A01;
    public AnonymousClass00H A02;
    public boolean A03;
    public boolean A04;
    public final C136836uU A05;
    public final C136836uU A06;

    public final void setMediaSharingUserJourneyLogger(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final AnonymousClass00H getMediaSharingUserJourneyLogger() {
        AnonymousClass00H r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("mediaSharingUserJourneyLogger");
        throw null;
    }

    public CameraModeTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A0K();
    }

    public final C1594884s getCameraModeTabLayoutListener() {
        return this.A01;
    }

    public final void setCameraModeTabLayoutListener(C1594884s r1) {
        this.A01 = r1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CameraModeTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A0K();
        C136836uU A0L = A0L(2131887882, false);
        A0L.A06 = 2;
        this.A06 = A0L;
        C136836uU A0L2 = A0L(2131887880, true);
        A0L2.A06 = 1;
        this.A05 = A0L2;
        this.A03 = new C145787Mp(this);
        setShouldCenterSelectedTab(true);
    }
}
