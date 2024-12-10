package com.whatsapp.newsletter.mex;

import X.A7K;
import X.AIj;
import X.AnonymousClass000;
import X.AnonymousClass00E;
import X.AnonymousClass10E;
import X.AnonymousClass1PY;
import X.AnonymousClass3Ma;
import X.AnonymousClass5YA;
import X.C000100c;
import X.C105735Td;
import X.C18030ve;
import X.C18070vi;
import X.C199610h;
import X.C29681ch;
import X.C32471hF;
import X.C86274Qz;
import X.C86354Rh;
import X.C86444Rq;
import android.content.Context;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminMetadataQueryResponseImpl;
import com.whatsapp.newsletter.iq.BaseNewslettersJob;
import com.whatsapp.util.Log;

public final class GetNewsletterAdminMetadataJob extends BaseNewslettersJob {
    public transient C18030ve A00;
    public transient AnonymousClass1PY A01;
    public transient C32471hF A02;
    public transient C86274Qz A03;
    public transient C86444Rq A04;
    public transient C86354Rh A05;
    public AnonymousClass5YA callback;
    public final boolean includeAdminCount;
    public final boolean includeCapabilities;
    public final boolean includePendingAdmins;
    public final C29681ch newsletterJid;

    public void A0A() {
        A7K a7k = new A7K();
        String rawString = this.newsletterJid.getRawString();
        a7k.A07("jid", rawString);
        boolean A1W = AnonymousClass000.A1W(rawString);
        Boolean A0h = AnonymousClass000.A0h();
        a7k.A06("include_thread_metadata", A0h);
        a7k.A06("include_messages", A0h);
        Boolean valueOf = Boolean.valueOf(this.includePendingAdmins);
        a7k.A06("fetch_pending_admin_invites", valueOf);
        boolean A1W2 = AnonymousClass000.A1W(valueOf);
        Boolean valueOf2 = Boolean.valueOf(this.includeAdminCount);
        a7k.A06("fetch_admin_count", valueOf2);
        boolean A1W3 = AnonymousClass000.A1W(valueOf2);
        Boolean valueOf3 = Boolean.valueOf(this.includeCapabilities);
        a7k.A06("fetch_capabilities", valueOf3);
        boolean A1W4 = AnonymousClass000.A1W(valueOf3);
        C199610h.A07(A1W);
        C199610h.A07(A1W2);
        C199610h.A07(A1W3);
        C199610h.A07(A1W4);
        AIj aIj = new AIj(a7k, NewsletterAdminMetadataQueryResponseImpl.class, "NewsletterAdminMetadataQuery");
        AnonymousClass1PY r0 = this.A01;
        if (r0 == null) {
            C18070vi.A11("graphqlIqClient");
            throw null;
        } else {
            r0.A01(aIj).A04(new C105735Td(this));
        }
    }

    public boolean A0C(Exception exc) {
        return true;
    }

    public void CIZ(Context context) {
        C18070vi.A0d(context, 0);
        super.CIZ(context);
        C000100c r1 = (C000100c) AnonymousClass00E.A00(context, C000100c.class);
        this.A00 = r1.BAL();
        AnonymousClass10E r12 = (AnonymousClass10E) r1;
        this.A01 = AnonymousClass3Ma.A0l(r12);
        this.A02 = (C32471hF) r12.A7Q.get();
        this.A04 = (C86444Rq) r12.A7A.get();
        this.A05 = (C86354Rh) r12.A7H.get();
        this.A03 = (C86274Qz) r12.A7O.get();
    }

    public GetNewsletterAdminMetadataJob(C29681ch r2, AnonymousClass5YA r3, boolean z, boolean z2, boolean z3) {
        super("GetNewsletterMetadataJob");
        this.newsletterJid = r2;
        this.includePendingAdmins = z;
        this.includeAdminCount = z2;
        this.includeCapabilities = z3;
        this.callback = r3;
    }

    public void A08() {
        Log.i("GetNewsletterAdminMetadataJob/onAdded");
    }

    public void A09() {
        Log.i("GetNewsletterAdminMetadataJob/onCanceled");
    }

    public void cancel() {
        super.cancel();
        this.callback = null;
    }
}
