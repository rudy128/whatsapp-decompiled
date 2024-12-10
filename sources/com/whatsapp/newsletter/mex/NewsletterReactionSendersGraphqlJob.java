package com.whatsapp.newsletter.mex;

import X.A7K;
import X.AIj;
import X.AnonymousClass10E;
import X.AnonymousClass1PY;
import X.AnonymousClass7KK;
import X.AnonymousClass80I;
import X.AnonymousClass85V;
import X.C108975cc;
import X.C162478Kx;
import X.C175048xu;
import X.C17890vO;
import X.C18070vi;
import X.C189819ju;
import X.C22811Dh;
import X.C29681ch;
import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterReactionSendersListResponseImpl;
import com.whatsapp.newsletter.iq.BaseNewslettersJob;
import com.whatsapp.util.Log;

public final class NewsletterReactionSendersGraphqlJob extends BaseNewslettersJob {
    public transient AnonymousClass1PY A00;
    public AnonymousClass85V callback;
    public final String messageSortId;
    public final C29681ch newsletterJid;

    public boolean A0C(Exception exc) {
        return false;
    }

    public void CIZ(Context context) {
        C18070vi.A0d(context, 0);
        super.CIZ(context);
        Log.i("NewsletterReactionSendersGraphqlJob/setContext");
        this.A00 = (AnonymousClass1PY) ((AnonymousClass10E) C17890vO.A0H(context)).ABh.get();
    }

    public NewsletterReactionSendersGraphqlJob(C29681ch r2, AnonymousClass85V r3, String str) {
        super("GetNewsletterMetadataJob");
        this.newsletterJid = r2;
        this.messageSortId = str;
        this.callback = r3;
    }

    public void A08() {
        AnonymousClass85V r1;
        Log.i("NewsletterReactionSendersGraphqlJob/onAdded");
        AnonymousClass1PY r0 = this.A00;
        if (r0 == null) {
            C18070vi.A11("graphqlClient");
            throw null;
        } else if (!r0.A02() && (r1 = this.callback) != null) {
            AnonymousClass7KK r12 = (AnonymousClass7KK) r1;
            Log.e((Throwable) new C175048xu());
            C22811Dh r2 = r12.A02;
            if (!r2.element) {
                r12.A01.resumeWith(new Object());
                r2.element = true;
            }
        }
    }

    public void A09() {
        Log.i("NewsletterReactionSendersGraphqlJob/onCanceled");
        this.callback = null;
    }

    public void A0A() {
        if (!this.isCancelled) {
            Log.i("NewsletterReactionSendersGraphqlJob/onRun");
            C189819ju r2 = GraphQlCallInput.A02;
            String rawString = this.newsletterJid.getRawString();
            C162478Kx A002 = r2.A00();
            C162478Kx.A01(A002, rawString, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            C162478Kx.A01(A002, this.messageSortId, "server_id");
            A7K a7k = new A7K();
            C108975cc.A0z(A002, a7k, "input");
            AIj aIj = new AIj(a7k, NewsletterReactionSendersListResponseImpl.class, "NewsletterReactionSendersList");
            AnonymousClass1PY r0 = this.A00;
            if (r0 == null) {
                C18070vi.A11("graphqlClient");
                throw null;
            } else {
                r0.A01(aIj).A04(new AnonymousClass80I(this));
            }
        }
    }

    public void cancel() {
        super.cancel();
        this.callback = null;
    }
}
