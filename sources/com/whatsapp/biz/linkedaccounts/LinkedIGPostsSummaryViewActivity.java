package com.whatsapp.biz.linkedaccounts;

import X.AFB;
import X.AGB;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass3MY;
import X.AnonymousClass3NL;
import X.AnonymousClass7I8;
import X.AnonymousClass8BR;
import X.AnonymousClass9AV;
import X.C000200d;
import X.C136376ti;
import X.C137116uw;
import X.C137966wJ;
import X.C161508Fg;
import X.C18070vi;
import X.C196089uR;
import X.C20339AGv;
import X.C22133AyB;
import X.C22134AyC;
import X.C22135AyD;
import X.C56452hU;
import X.C63662tU;
import X.C63932tv;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.jid.UserJid;
import com.whatsapp.ui.media.MediaCardGrid;

public final class LinkedIGPostsSummaryViewActivity extends AnonymousClass1FY {
    public Toolbar A00;
    public C56452hU A01;
    public C161508Fg A02;
    public UserJid A03;
    public C196089uR A04;
    public AnonymousClass9AV A05;
    public MediaCardGrid A06;
    public AnonymousClass00H A07;
    public boolean A08;

    public void A2y() {
        if (!this.A08) {
            this.A08 = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r2 = A002.AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A01(r2, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            this.A05 = (AnonymousClass9AV) r1.ACv.get();
            this.A04 = (C196089uR) r1.ACu.get();
            this.A07 = C000200d.A00(r1.ACx);
            this.A01 = (C56452hU) A002.A2v.get();
        }
    }

    public LinkedIGPostsSummaryViewActivity(int i) {
        this.A08 = false;
        AGB.A00(this, 20);
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.AGw, X.1Ir, java.lang.Object] */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        C18070vi.A0X(intent);
        C56452hU r3 = this.A01;
        if (r3 != null) {
            AnonymousClass9AV r2 = this.A05;
            if (r2 != null) {
                C196089uR r1 = this.A04;
                if (r1 != null) {
                    ? obj = new Object();
                    obj.A00 = intent;
                    obj.A01 = r3;
                    obj.A03 = r2;
                    obj.A02 = r1;
                    C161508Fg r0 = (C161508Fg) AnonymousClass8BR.A0C(obj, this).A00(C161508Fg.class);
                    this.A02 = r0;
                    if (r0 == null) {
                        C18070vi.A11("linkedIGPostsSummaryViewModel");
                        throw null;
                    }
                    C20339AGv.A00(this, r0.A08, new C22133AyB(this), 12);
                    C161508Fg r02 = this.A02;
                    if (r02 == null) {
                        C18070vi.A11("linkedIGPostsSummaryViewModel");
                        throw null;
                    }
                    C20339AGv.A00(this, r02.A07, new C22134AyC(this), 12);
                    C161508Fg r03 = this.A02;
                    if (r03 == null) {
                        C18070vi.A11("linkedIGPostsSummaryViewModel");
                        throw null;
                    }
                    C20339AGv.A00(this, r03.A06, new C22135AyD(this), 12);
                    C161508Fg r22 = this.A02;
                    if (r22 == null) {
                        C18070vi.A11("linkedIGPostsSummaryViewModel");
                        throw null;
                    }
                    UserJid userJid = (UserJid) r22.A00.getParcelableExtra("jid");
                    if (userJid != null) {
                        r22.A02 = userJid;
                        this.A03 = userJid;
                        setContentView(2131625569);
                        Toolbar toolbar = (Toolbar) AnonymousClass3MY.A0H(this, 2131431520);
                        this.A00 = toolbar;
                        if (toolbar == null) {
                            C18070vi.A11("toolbar");
                            throw null;
                        }
                        toolbar.setTitle(2131891249);
                        AnonymousClass3NL.A02(toolbar.getContext(), toolbar, this.A00, 2131231672);
                        toolbar.setNavigationOnClickListener(new AFB(this, 14));
                        MediaCardGrid mediaCardGrid = (MediaCardGrid) AnonymousClass3MY.A0H(this, 2131432372);
                        this.A06 = mediaCardGrid;
                        if (mediaCardGrid == null) {
                            C18070vi.A11("mediaCard");
                            throw null;
                        }
                        mediaCardGrid.setTitle(getString(2131891248));
                        MediaCardGrid mediaCardGrid2 = this.A06;
                        if (mediaCardGrid2 == null) {
                            C18070vi.A11("mediaCard");
                            throw null;
                        }
                        mediaCardGrid2.A07((View.OnClickListener) null, 3);
                        C161508Fg r23 = this.A02;
                        if (r23 == null) {
                            C18070vi.A11("linkedIGPostsSummaryViewModel");
                            throw null;
                        }
                        MediaCardGrid mediaCardGrid3 = this.A06;
                        if (mediaCardGrid3 == null) {
                            C18070vi.A11("mediaCard");
                            throw null;
                        }
                        C56452hU r12 = r23.A01;
                        UserJid userJid2 = r23.A02;
                        if (userJid2 == null) {
                            C18070vi.A11("bizJid");
                            throw null;
                        }
                        AnonymousClass7I8 A002 = r12.A00(r23.A09, new C136376ti(userJid2, mediaCardGrid3.getThumbnailPixelSize(), mediaCardGrid3.getThumbnailPixelSize(), 1, true, true, true));
                        r23.A05 = A002;
                        A002.A02();
                        AnonymousClass00H r04 = this.A07;
                        if (r04 != null) {
                            C137966wJ r24 = (C137966wJ) r04.get();
                            UserJid userJid3 = this.A03;
                            if (userJid3 == null) {
                                C18070vi.A11("bizJid");
                                throw null;
                            } else {
                                C137966wJ.A00(r24, userJid3, 0);
                            }
                        } else {
                            C18070vi.A11("linkedIGPostsLoggingHelper");
                            throw null;
                        }
                    } else {
                        finish();
                    }
                } else {
                    C18070vi.A11("imageLoader");
                    throw null;
                }
            } else {
                C18070vi.A11("cacheManager");
                throw null;
            }
        } else {
            C18070vi.A11("serviceFactory");
            throw null;
        }
    }

    public LinkedIGPostsSummaryViewActivity() {
        this(0);
    }
}
