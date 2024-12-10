package X;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.whatsapp.WaImageButton;
import com.whatsapp.documentpicker.DocumentPreviewActivity;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.gifvideopreview.GifVideoPreviewActivity;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.5rS  reason: invalid class name and case insensitive filesystem */
public abstract class C114645rS extends C114785rz implements C108515bp, AnonymousClass8AT, AnonymousClass86Q, B8E, B8G {
    public View A00;
    public View A01;
    public View A02;
    public FrameLayout A03;
    public ImageView A04;
    public AnonymousClass6ZN A05;
    public AnonymousClass1M9 A06;
    public C24921Me A07;
    public C88184Yq A08;
    public AnonymousClass1CJ A09;
    public AnonymousClass77K A0A;
    public C24661Le A0B;
    public C1193267r A0C;
    public C132026m3 A0D;
    public C18010vc A0E;
    public C32741hg A0F;
    public AnonymousClass4P4 A0G;
    public C26521Sl A0H;
    public C35511mM A0I;
    public AnonymousClass00H A0J;
    public AnonymousClass00H A0K;
    public AnonymousClass00H A0L;
    public AnonymousClass00H A0M;
    public AnonymousClass00H A0N;
    public AnonymousClass00H A0O;
    public File A0P;
    public List A0Q;
    public List A0R;
    public boolean A0S;
    public AnonymousClass8AQ A0T;
    public C135286rx A0U;
    public final AnonymousClass00H A0V = C18150vq.A01(new C147087Rt(this, 1));

    public void A4b(File file, boolean z, boolean z2) {
        DocumentPreviewActivity documentPreviewActivity = (DocumentPreviewActivity) this;
        if (documentPreviewActivity.A0R.size() == 0) {
            documentPreviewActivity.A4c(false);
            return;
        }
        Uri uri = (Uri) documentPreviewActivity.getIntent().getParcelableExtra("uri");
        if (uri != null) {
            File file2 = file;
            if (z) {
                documentPreviewActivity.A00.A06(uri, documentPreviewActivity, (AnonymousClass206) null, file2, documentPreviewActivity.A0G.A05.getStringText(), documentPreviewActivity.A0R, documentPreviewActivity.A0G.A05.getMentions(), 1, false);
                if (z2) {
                    int size = documentPreviewActivity.A0R.size();
                    AnonymousClass1L9 r3 = documentPreviewActivity.A01;
                    AnonymousClass1LU r1 = documentPreviewActivity.A01;
                    if (size == 1) {
                        r3.A09(documentPreviewActivity, r1.A1w(documentPreviewActivity, C108945cZ.A0i(documentPreviewActivity.A0R, 0), 0));
                        documentPreviewActivity.setResult(-1);
                    } else {
                        r3.A09(documentPreviewActivity, C108985cd.A0B(documentPreviewActivity));
                    }
                }
                documentPreviewActivity.CPW(documentPreviewActivity.A0R, 1);
                documentPreviewActivity.setResult(-1);
            } else {
                Intent A0A2 = C17880vN.A0A();
                if (file != null) {
                    A0A2.putExtra("file_path", file.getPath());
                }
                A0A2.putExtra("uri", documentPreviewActivity.getIntent().getParcelableExtra("uri"));
                A0A2.putExtra("caption", documentPreviewActivity.A0G.A05.getStringText());
                A0A2.putExtra("mentions", AnonymousClass4aJ.A01(documentPreviewActivity.A0G.A05.getMentions()));
                A0A2.putStringArrayListExtra("jids", C22971Dz.A0B(documentPreviewActivity.A0R));
                A0A2.putExtra("clear_message_after_send", documentPreviewActivity.getIntent().getBooleanExtra("clear_message_after_send", false));
                documentPreviewActivity.setResult(-1, A0A2);
            }
            documentPreviewActivity.finish();
        }
    }

    public void A4c(boolean z) {
        int i;
        List list = this.A0R;
        if (this instanceof GifVideoPreviewActivity) {
            i = 13;
        } else {
            i = 9;
        }
        ArrayList A10 = C17880vN.A10(Collections.singleton(Integer.valueOf(i)));
        Boolean valueOf = Boolean.valueOf(z);
        Intent A0B2 = C72473Md.A0B(this, "com.whatsapp.contact.picker.ContactPicker");
        A0B2.putExtra("source_surface", 12);
        C108995ce.A0n(A0B2, true, A10);
        if (list != null) {
            C108965cb.A10(A0B2, list);
        }
        if (valueOf != null) {
            A0B2.putExtra("status_chip_clicked", valueOf);
        }
        C108945cZ.A0u(this.A0L).A03(A0B2, this.A0A);
        startActivityForResult(A0B2, 1);
    }

    public /* synthetic */ void Bkz() {
    }

    public void C2i(boolean z) {
        this.A0S = true;
        A4c(z);
    }

    public void C6b() {
    }

    public void C6d(int i) {
    }

    public void C6f(int i) {
    }

    public /* synthetic */ void C6h() {
    }

    public /* synthetic */ void CAB() {
    }

    public /* synthetic */ void onCaptionLayoutClicked(View view) {
    }

    public /* synthetic */ void onDismiss() {
    }

    private void A03() {
        A4b(this.A0P, getIntent().getBooleanExtra("send", false), getIntent().getBooleanExtra("handle_redirects", false));
        this.A08.A03(2);
        this.A0P = null;
    }

    public void A4d(boolean z, boolean z2) {
        this.A0T.CKJ(this.A0A, this.A0R, true);
        if (z2 || !z) {
            C137286vD.A01(this.A00, this.A00);
        } else {
            C137286vD.A00(this.A00, this.A00);
        }
        C135286rx r2 = this.A0U;
        C18070vi.A0d(this.A0E, 0);
        r2.A02(z, z2);
    }

    public void Bxj(File file, String str) {
        this.A0P = file;
        if (TextUtils.isEmpty(getIntent().getStringExtra("media_url")) && file == null) {
            Log.e("MediaPreviewActivity/onMediaFileLoaded neither file nor media url provided");
            finish();
        }
    }

    public void C54() {
        int i;
        if (!C108975cc.A1H(this.A0M) || C22971Dz.A01(this.A0R) == null || C22971Dz.A0i(this.A0R)) {
            this.A0F.A08(this.A0A);
            C32741hg r2 = this.A0F;
            if (this instanceof GifVideoPreviewActivity) {
                i = 13;
            } else {
                i = 9;
            }
            r2.A0G(Integer.valueOf(i), "default_share");
            A03();
            return;
        }
        CMl(AnonymousClass6XW.A00(this.A0A, C108945cZ.A0u(this.A0L), this, AnonymousClass6RU.MEDIA_PREVIEW_ACTIVITY));
        C108985cd.A0X(this.A0F).A04("tap_share_sheet_entry");
    }

    public void C6c(AnonymousClass77K r4) {
        if (this.A0A != r4) {
            this.A0A = r4;
        }
        this.A0T.CKJ(r4, this.A0R, true);
    }

    public void C6e() {
        int i;
        C32741hg r2 = this.A0F;
        if (this instanceof GifVideoPreviewActivity) {
            i = 13;
        } else {
            i = 9;
        }
        r2.A0G(Integer.valueOf(i), "share_sheet_share_button");
        A03();
    }

    public void onStart() {
        AnonymousClass1E7 A0H2;
        super.onStart();
        if (this.A0G == null) {
            AnonymousClass1BI A0l = AnonymousClass3MX.A0l(C72453Mb.A0u(this));
            C18030ve r8 = this.A0E;
            AnonymousClass1L4 r7 = this.A09;
            AnonymousClass190 r12 = this.A03;
            AnonymousClass1KW r5 = this.A0D;
            C1193267r r4 = this.A0C;
            AnonymousClass11C r13 = this.A08;
            C18000vb r15 = this.A00;
            EmojiSearchProvider emojiSearchProvider = (EmojiSearchProvider) this.A0J.get();
            C19830z4 r14 = this.A0A;
            C18010vc r2 = this.A0E;
            A59 A0e = C108945cZ.A0e(this.A0K);
            AnonymousClass1L2 r1 = this.A0C;
            View view = this.A01;
            if (A0l == null) {
                A0H2 = null;
            } else {
                A0H2 = this.A06.A0H(A0l);
            }
            EmojiSearchProvider emojiSearchProvider2 = emojiSearchProvider;
            C18030ve r22 = r8;
            C1193267r r19 = r4;
            AnonymousClass1KW r20 = r5;
            AnonymousClass1L2 r17 = r1;
            this.A0G = new AnonymousClass4P4(view, this, r12, r13, r14, r15, A0H2, r17, A0e, r19, r20, emojiSearchProvider2, r22, this, r2, r7, getIntent().getStringExtra("caption"), AnonymousClass4aJ.A03(getIntent().getStringExtra("mentions")), this.A0R, this.A02.A0N());
        }
    }

    public void Bns() {
        A03();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            this.A0R = C72463Mc.A0r(intent, AnonymousClass1BI.class);
            C17960vV.A07(intent);
            AnonymousClass77K A002 = AnonymousClass727.A00(intent.getExtras(), this.A0L);
            C17960vV.A07(A002);
            this.A0A = A002;
            A4d(AnonymousClass000.A1R(this.A0R.size()), AnonymousClass000.A1Z(this.A0V.get(), C122506Qq.GONE));
            if (i2 == -1) {
                A03();
            }
        } else if (i == 2 && i2 == -1 && intent != null) {
            C17960vV.A07(intent);
            AnonymousClass77K A003 = AnonymousClass727.A00(intent.getExtras(), this.A0L);
            AnonymousClass77K r2 = this.A0A;
            if (r2 != A003) {
                this.A0A = A003;
                r2 = A003;
            }
            this.A0T.CKJ(r2, this.A0R, true);
        }
    }

    public void onCreate(Bundle bundle) {
        List A0r;
        super.onCreate(bundle);
        C003401n supportActionBar = getSupportActionBar();
        boolean z = false;
        if (supportActionBar != null) {
            supportActionBar.A0W(true);
            supportActionBar.A0X(false);
        }
        View inflate = getLayoutInflater().inflate(2131625969, (ViewGroup) null, false);
        this.A01 = inflate;
        setContentView(inflate);
        this.A03 = C108945cZ.A0P(this.A01, 2131434045);
        this.A02 = C110885hR.A0A(this, 2131432166);
        this.A04 = (ImageView) C110885hR.A0A(this, 2131436134);
        this.A00 = C110885hR.A0A(this, 2131431649);
        this.A02.setVisibility(0);
        this.A04.setVisibility(0);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("uri");
        if (parcelableExtra == null) {
            Bxj((File) null, (String) null);
        } else {
            AnonymousClass6MB r2 = new AnonymousClass6MB(this, this, this.A0H);
            this.A05.CGM(r2, parcelableExtra);
        }
        AnonymousClass1BI A0l = AnonymousClass3MX.A0l(C72453Mb.A0u(this));
        if (A0l != null) {
            A0r = Collections.singletonList(A0l);
        } else {
            A0r = C72463Mc.A0r(getIntent(), AnonymousClass1BI.class);
        }
        this.A0Q = A0r;
        this.A0R = A0r;
        ViewStub viewStub = (ViewStub) C110885hR.A0A(this, 2131432424);
        C132026m3 r22 = this.A0D;
        AnonymousClass00H r1 = this.A0V;
        C122506Qq r0 = (C122506Qq) r1.get();
        C18070vi.A0d(r0, 0);
        C18070vi.A0d(viewStub, 1);
        this.A0T = r22.A00(viewStub, r0, false);
        this.A0U = new C135286rx((WaImageButton) C110885hR.A0A(this, 2131435142), AnonymousClass10E.A6R(this.A05.A00.A01));
        if (getIntent().getBooleanExtra("usage_quote", false) || C22971Dz.A0h(this.A0R)) {
            this.A0T.BIj();
        } else {
            this.A0T.CKK(this);
        }
        AnonymousClass3Ma.A1D(this.A0U.A01, this, 9);
        if (C108985cd.A1a(this.A0O)) {
            z = Boolean.TRUE.equals(this.A0I.A01(AnonymousClass00R.A0G));
        }
        this.A0A = new AnonymousClass77K(this.A0B.A0A(), this.A0B.A0B(), this.A0B.A05(), z, false, false, false);
        A4d(AnonymousClass000.A1R(this.A0R.size()), AnonymousClass000.A1Z(r1.get(), C122506Qq.GONE));
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.A0P != null && isFinishing()) {
            this.A05.CGF(new C70603Bt(this, 26));
        }
    }
}
