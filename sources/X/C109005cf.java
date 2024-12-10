package X;

import android.animation.Animator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.text.style.URLSpan;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.whatsapp.WaButtonWithLoader;
import com.whatsapp.biz.catalog.CatalogMediaViewFragment;
import com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import com.whatsapp.gallerypicker.MediaPickerFragment;
import com.whatsapp.mediacomposer.MediaComposerFragment;
import com.whatsapp.mediacomposer.VideoComposerFragment;
import com.whatsapp.mediacomposer.doodle.ColorPickerComponent;
import com.whatsapp.payments.ui.widget.CardInputText;
import com.whatsapp.stickers.store.StickerStoreTabFragment;
import com.whatsapp.support.faq.FaqItemActivity;
import com.whatsapp.userban.ui.fragment.BanAppealBaseFragment;
import com.whatsapp.wabloks.base.BkScreenFragment;
import com.whatsapp.waffle.wfac.ui.WfacBanBaseFragment;
import java.net.HttpURLConnection;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import org.npci.upi.security.pinactivitycomponent.widget.FormItemEditText;

/* renamed from: X.5cf  reason: invalid class name and case insensitive filesystem */
public abstract class C109005cf {
    public static int A04(AnonymousClass8B2 r2) {
        int type = r2.getType();
        if (type == 1) {
            return 36;
        }
        if (type != 2) {
            return 35;
        }
        return 37;
    }

    public static C58252kO A0B(String[] strArr) {
        byte[] bArr = {5};
        byte[] A05 = A8G.A05(bArr, Base64.decode(strArr[2], 0));
        C18070vi.A0X(A05);
        return new C58252kO(C63962tz.A01(A05));
    }

    public static C24149BwF A0C(Context context, View view, C25022CTy cTy) {
        C24149BwF bwF = new C24149BwF(context, cTy, 4, false);
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(2131168871);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C18070vi.A0z(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(dimensionPixelSize, 0, dimensionPixelSize, 0);
        view.setLayoutParams(marginLayoutParams);
        view.requestLayout();
        return bwF;
    }

    public static String A0D(C32011gU r5, AnonymousClass206 r6) {
        String A0P = r6.A0P();
        if (!(A0P == null || A0P.length() == 0)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A0P);
            r5.A05(spannableStringBuilder);
            URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
            C18070vi.A0b(uRLSpanArr);
            if (uRLSpanArr.length != 0) {
                return uRLSpanArr[0].getURL();
            }
        }
        return null;
    }

    public static void A0M(Context context, Drawable drawable, SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        drawable.setBounds(0, 0, i, i);
        drawable.setColorFilter(context.getResources().getColor(i2), PorterDuff.Mode.SRC_ATOP);
        spannableStringBuilder.setSpan(new ImageSpan(drawable, 0), 0, 1, 33);
    }

    public static void A0P(Context context, String str, String str2, int i) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity");
        intent.putExtra("selected_category_title", str);
        intent.putExtra("selected_category", i);
        intent.putExtra("selected_country", str2);
        intent.putExtra("is_in_search_mode", false);
        context.startActivity(intent);
    }

    public static void A0Q(GradientDrawable gradientDrawable, float[] fArr, float f) {
        fArr[2] = f;
        fArr[3] = f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        gradientDrawable.setCornerRadii(fArr);
    }

    public static void A0U(C26378Cye cye, Object obj, Object[] objArr, int i) {
        objArr[0] = obj;
        objArr[1] = false;
        C26378Cye.A06(cye, "seekTo: seekTimeMsWithPreview: %d, jumpSeek: %s", objArr);
        cye.A0O = (long) i;
        cye.A0P = C26378Cye.A0U.incrementAndGet();
        cye.A0Q = SystemClock.elapsedRealtime();
        Handler handler = cye.A0C;
        handler.sendMessage(handler.obtainMessage(4, new long[]{cye.A0O, cye.A0P, 0}));
    }

    public static void A0l(MediaPickerFragment mediaPickerFragment, int i) {
        int i2 = mediaPickerFragment.A01;
        if (i >= i2 && !mediaPickerFragment.A0K) {
            C18030ve A27 = mediaPickerFragment.A27();
            C18040vf r3 = C18040vf.A02;
            mediaPickerFragment.A01 = i2 + (C18020vd.A00(r3, A27, 2693) - C18020vd.A00(r3, mediaPickerFragment.A27(), 2614));
            mediaPickerFragment.A0K = true;
        }
    }

    public static void A0r(float[] fArr, Object[] objArr, float f) {
        fArr[0] = f;
        objArr[0] = PropertyValuesHolder.ofFloat("scaleX", fArr);
        objArr[1] = PropertyValuesHolder.ofFloat("scaleY", new float[]{f});
    }

    public static void A0s(Object[] objArr) {
        objArr[2] = "datetaken";
        objArr[3] = "mini_thumb_magic";
        objArr[4] = "orientation";
        objArr[5] = "title";
        objArr[6] = "mime_type";
        objArr[7] = "date_modified";
        objArr[8] = "_size";
    }

    public static int[] A0v(FormItemEditText formItemEditText) {
        formItemEditText.A0C = null;
        formItemEditText.A0E = null;
        formItemEditText.A0D = null;
        formItemEditText.A05 = 0;
        formItemEditText.A00 = 24.0f;
        formItemEditText.A01 = 4.0f;
        formItemEditText.A02 = 8.0f;
        formItemEditText.A09 = new Rect();
        formItemEditText.A0G = false;
        formItemEditText.A0F = null;
        formItemEditText.A03 = 1.0f;
        formItemEditText.A04 = 2.0f;
        formItemEditText.A0H = false;
        formItemEditText.A0I = false;
        formItemEditText.A0L = new int[][]{new int[]{16842913}, new int[]{16842914}, new int[]{16842908}, new int[]{-16842908}};
        return new int[4];
    }

    public static float A00(RectF rectF, JSONObject jSONObject) {
        rectF.left = ((float) jSONObject.getInt("l")) / 100.0f;
        rectF.top = ((float) jSONObject.getInt("t")) / 100.0f;
        rectF.right = ((float) jSONObject.getInt("r")) / 100.0f;
        rectF.bottom = ((float) jSONObject.getInt("b")) / 100.0f;
        return 100.0f;
    }

    public static int A01(int i) {
        if (i == 97) {
            return 17;
        }
        if (i == 98) {
            return 20;
        }
        if (i == 100) {
            return 16;
        }
        if (i == 103) {
            return 13;
        }
        if (i == 105) {
            return 12;
        }
        if (i == 108) {
            return 14;
        }
        if (i == 115) {
            return 23;
        }
        if (i == 117) {
            return 2;
        }
        if (i != 118) {
            return 0;
        }
        return 15;
    }

    public static int A03(Fragment fragment) {
        return (int) (((double) ((AnonymousClass1ZR) AnonymousClass1ZP.A00.invoke(AnonymousClass1ZS.A00)).BFR(fragment.A1D()).A00().height()) * 0.3d);
    }

    public static long A06(JSONObject jSONObject) {
        if (jSONObject.optInt("ephemeral_duration_sec") == -1) {
            return -1;
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        String optString = jSONObject.optString("last_update_time");
        C18070vi.A0X(optString);
        return timeUnit.toMillis(Long.parseLong(optString)) + timeUnit.toMillis((long) jSONObject.optInt("ephemeral_duration_sec"));
    }

    public static Intent A07(Context context, String str, String str2) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.support.DescribeProblemActivity");
        intent.putExtra("com.whatsapp.support.DescribeProblemActivity.from", str);
        intent.putExtra("com.whatsapp.support.DescribeProblemActivity.serverstatus", str2);
        return intent;
    }

    public static Intent A08(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.support.faq.FaqItemActivity");
        intent.putExtra("title", str);
        intent.putExtra("content", str2);
        intent.putExtra("url", str3);
        return intent;
    }

    public static String A0E(Object obj) {
        String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
        C18070vi.A0X(format);
        return format;
    }

    public static StringBuilder A0F(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        String str3 = C197569wu.A0Q;
        C18070vi.A0Z(str3);
        sb.append(str3);
        sb.append("/");
        sb.append(str);
        sb.append("?");
        sb.append("access_token=");
        sb.append(str2);
        sb.append("&format=json");
        return sb;
    }

    public static void A0H(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("unexpected error code: ");
        sb.append(i);
        C17960vV.A0F(false, sb.toString());
    }

    public static void A0I(Animator.AnimatorListener animatorListener, ValueAnimator valueAnimator) {
        valueAnimator.setDuration(400);
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.addListener(animatorListener);
    }

    public static void A0K(ContentValues contentValues, C1418377d r3) {
        contentValues.put("url", r3.A0I);
        contentValues.put("enc_hash", r3.A0A);
        contentValues.put("direct_path", r3.A08);
        contentValues.put("mimetype", r3.A0E);
        contentValues.put("media_key", r3.A0D);
    }

    public static void A0L(Context context, Intent intent, Parcelable parcelable) {
        intent.putExtra("android.intent.extra.STREAM", parcelable);
        intent.putExtra("android.intent.extra.SUBJECT", context.getString(2131893435));
        intent.addFlags(524288);
        context.startActivity(Intent.createChooser(intent, context.getString(2131893435)));
    }

    public static void A0R(View view, float f) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator scaleX;
        ViewPropertyAnimator scaleY;
        if (view != null && (animate = view.animate()) != null && (scaleX = animate.scaleX(f)) != null && (scaleY = scaleX.scaleY(f)) != null) {
            scaleY.setDuration(200);
        }
    }

    public static void A0S(View view, WaButtonWithLoader waButtonWithLoader) {
        waButtonWithLoader.setSize(AnonymousClass4D1.SMALL);
        ViewParent parent = view.getParent();
        C18070vi.A0z(parent, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ViewGroup.LayoutParams layoutParams = ((View) parent).getLayoutParams();
        C18070vi.A0z(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((C39151sZ) layoutParams).A0J = waButtonWithLoader.getId();
        waButtonWithLoader.getLayoutParams().width = -2;
        waButtonWithLoader.findViewById(2131428624).getLayoutParams().width = -2;
    }

    public static void A0X(AnonymousClass1K1 r1, AnonymousClass10E r2, AnonymousClass10G r3, MediaPickerFragment mediaPickerFragment) {
        mediaPickerFragment.A0D = C000200d.A00(r2.A14);
        mediaPickerFragment.A05 = (AnonymousClass731) r3.A7e.get();
        mediaPickerFragment.A0E = C000200d.A00(r1.A6S);
        mediaPickerFragment.A0F = C000200d.A00(r3.ADC);
        mediaPickerFragment.A0G = C000200d.A00(r2.AYd);
        mediaPickerFragment.A0B = (AnonymousClass1Q5) r2.A8O.get();
        mediaPickerFragment.A0H = C000200d.A00(r2.A9c);
        mediaPickerFragment.A0C = (C36711oL) r3.A4N.get();
    }

    public static void A0Y(C36241nZ r1, AnonymousClass10E r2, AnonymousClass10G r3, C18030ve r4, BkScreenFragment bkScreenFragment) {
        bkScreenFragment.A03 = r4;
        AnonymousClass1K1 r12 = r1.A2O;
        bkScreenFragment.A06 = AnonymousClass1K1.A01(r12);
        bkScreenFragment.A02 = r3.A2Q();
        bkScreenFragment.A01 = (C19943A0a) r2.AFZ.get();
        bkScreenFragment.A05 = C000200d.A00(r2.AmX);
        bkScreenFragment.A00 = (C56382hN) r12.A64.get();
        bkScreenFragment.A04 = (AnonymousClass198) r2.AC0.get();
    }

    public static void A0b(C36241nZ r1, AnonymousClass10E r2, C18030ve r3, MediaGalleryFragmentBase mediaGalleryFragmentBase) {
        mediaGalleryFragmentBase.A0F = r3;
        mediaGalleryFragmentBase.A09 = (C24771Lp) r2.A0o.get();
        mediaGalleryFragmentBase.A0M = C000200d.A00(r1.A1B);
        mediaGalleryFragmentBase.A08 = (AnonymousClass1KB) r2.A4b.get();
        mediaGalleryFragmentBase.A0N = C000200d.A00(r2.A9E);
    }

    public static void A0f(AnonymousClass10E r1, AnonymousClass10G r2, C18030ve r3, WfacBanBaseFragment wfacBanBaseFragment) {
        wfacBanBaseFragment.A05 = r3;
        wfacBanBaseFragment.A09 = C000200d.A00(r1.A08);
        wfacBanBaseFragment.A00 = (AnonymousClass1L9) r1.A0E.get();
        wfacBanBaseFragment.A07 = (C36401np) r2.A30.get();
        wfacBanBaseFragment.A01 = (AnonymousClass11C) r1.AAp.get();
        wfacBanBaseFragment.A02 = (AnonymousClass11P) r1.AAv.get();
        wfacBanBaseFragment.A06 = (AnonymousClass1LU) r1.ABd.get();
        wfacBanBaseFragment.A03 = (C19830z4) r1.ABl.get();
        wfacBanBaseFragment.A04 = (AnonymousClass11O) r1.ABn.get();
        wfacBanBaseFragment.A0A = C000200d.A00(r1.AnK);
    }

    public static void A0g(AnonymousClass10E r1, AnonymousClass10G r2, MediaComposerFragment mediaComposerFragment) {
        mediaComposerFragment.A0Y = C000200d.A00(r2.A2V);
        mediaComposerFragment.A0T = (AnonymousClass1L4) r2.A2e.get();
        mediaComposerFragment.A0H = (AnonymousClass689) r1.A5q.get();
        mediaComposerFragment.A0U = (C26521Sl) r1.A69.get();
        mediaComposerFragment.A0Z = C000200d.A00(r2.ADC);
        mediaComposerFragment.A0a = C000200d.A00(r1.A6E);
        mediaComposerFragment.A0O = AnonymousClass10E.AFe(r1);
        mediaComposerFragment.A0L = (C1193367s) r1.Afz.get();
        mediaComposerFragment.A08 = (AnonymousClass18O) r1.A9p.get();
        mediaComposerFragment.A0M = (AnonymousClass7IT) r2.AH2.get();
        mediaComposerFragment.A0N = (C1192967n) r2.AH4.get();
        mediaComposerFragment.A0b = C000200d.A00(r2.AH5);
        mediaComposerFragment.A0c = C000200d.A00(r1.AAB);
    }

    public static void A0i(AnonymousClass10E r1, AnonymousClass10G r2, StickerStoreTabFragment stickerStoreTabFragment, AnonymousClass10I r4) {
        stickerStoreTabFragment.A0C = r4;
        stickerStoreTabFragment.A0H = C000200d.A00(r1.ABd);
        stickerStoreTabFragment.A0F = C000200d.A00(r1.AAP);
        stickerStoreTabFragment.A0D = C000200d.A00(r1.A0R);
        stickerStoreTabFragment.A0A = (AnonymousClass1SB) r1.AAS.get();
        stickerStoreTabFragment.A0G = C000200d.A00(r1.AAQ);
        stickerStoreTabFragment.A09 = (C26631Sw) r1.AAO.get();
        stickerStoreTabFragment.A08 = (C24481Km) r1.AA8.get();
        stickerStoreTabFragment.A0E = C000200d.A00(r2.A1h);
        stickerStoreTabFragment.A0I = C000200d.A00(r1.ABl);
    }

    public static void A0j(AnonymousClass10E r1, C18030ve r2, BanAppealBaseFragment banAppealBaseFragment) {
        banAppealBaseFragment.A04 = r2;
        banAppealBaseFragment.A05 = C000200d.A00(r1.A08);
        banAppealBaseFragment.A00 = (AnonymousClass1L9) r1.A0E.get();
        banAppealBaseFragment.A01 = (AnonymousClass11P) r1.AAv.get();
        banAppealBaseFragment.A02 = (C19830z4) r1.ABl.get();
        banAppealBaseFragment.A03 = (AnonymousClass11O) r1.ABn.get();
    }

    public static void A0k(CatalogMediaViewFragment catalogMediaViewFragment, A7D a7d) {
        A8Q a8q = catalogMediaViewFragment.A05;
        if (a8q != null) {
            a7d.A0B = a8q.A03;
            a7d.A05 = Integer.valueOf(a8q.A0D.get());
            A8Q a8q2 = catalogMediaViewFragment.A05;
            if (a8q2 != null) {
                a7d.A0E = a8q2.A01;
                a7d.A0F = a8q2.A02;
                a7d.A09 = Long.valueOf((long) a8q2.A0E.getAndIncrement());
                return;
            }
        }
        C18070vi.A11("catalogAnalyticManager");
        throw null;
    }

    public static void A0m(ColorPickerComponent colorPickerComponent, AnonymousClass6UC r4, AnonymousClass7JF r5) {
        if (C18020vd.A05(C18040vf.A01, r5.A0I, 5976)) {
            AnonymousClass7JF.A06(r5, colorPickerComponent.getSelectedStrokeSize(), r4.A00);
        }
    }

    public static void A0p(Object obj, Object obj2, Object obj3, Object obj4) {
        C18070vi.A0d(obj, 32);
        C18070vi.A0d(obj2, 33);
        C18070vi.A0d(obj3, 34);
        C18070vi.A0d(obj4, 35);
    }

    public static int A02(View view, C38331r7 r4) {
        return (r4.A09(view) + (r4.A07(view) / 2)) - (r4.A04() + (r4.A05() / 2));
    }

    public static int A05(CardInputText cardInputText) {
        cardInputText.A0G();
        cardInputText.A00 = 1.0f;
        cardInputText.A01 = 2.0f;
        cardInputText.A02 = 24.0f;
        cardInputText.A03 = 8.0f;
        cardInputText.A04 = 4;
        return 4;
    }

    public static Rect A09(View view) {
        return new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public static AnonymousClass10E A0A(AnonymousClass1K1 r1, AnonymousClass1FU r2) {
        r2.A01 = AnonymousClass1K1.A1X(r1);
        AnonymousClass10E r12 = r1.AAQ;
        r2.A05 = (AnonymousClass10I) r12.AC1.get();
        C63932tv.A06(r2, (AnonymousClass11P) r12.AAv.get());
        return r12;
    }

    public static Random A0G(VoiceParticipantAudioWave voiceParticipantAudioWave) {
        voiceParticipantAudioWave.A03();
        voiceParticipantAudioWave.A09 = new double[0];
        voiceParticipantAudioWave.A0B = new double[0];
        voiceParticipantAudioWave.A0A = new double[0];
        voiceParticipantAudioWave.A04 = new Paint(1);
        return new Random();
    }

    public static void A0J(Activity activity, DialogInterface.OnClickListener onClickListener, C73203Rj r3, int i) {
        r3.A0L(onClickListener, activity.getString(i));
        if (!activity.isFinishing()) {
            r3.create().show();
        }
    }

    public static void A0N(Context context, View view, int i, int i2, int i3) {
        C43531zx.A03(view, new C39351sv(i, context.getResources().getDimensionPixelSize(2131169528), i2, i3));
        view.getLayoutParams().height = context.getResources().getDimensionPixelSize(2131169529);
        view.requestLayout();
    }

    public static void A0O(Context context, Toolbar toolbar, C18000vb r5) {
        toolbar.setNavigationIcon((Drawable) new C74743cP(AnonymousClass4aX.A02(context, 2131231675, AnonymousClass1YL.A00(context, 2130970284, 2131101275)), r5));
    }

    public static void A0T(Fragment fragment) {
        C28281Zt.A06(fragment.A1D(), AnonymousClass1YL.A00(fragment.A1n(), 2130969148, 2131100157));
    }

    public static void A0V(C114615rM r1, A7D a7d) {
        a7d.A0B = r1.A4i().A03;
        a7d.A05 = Integer.valueOf(r1.A4i().A0D.get());
        a7d.A0E = r1.A4i().A01;
        a7d.A0F = r1.A4i().A02;
        a7d.A09 = Long.valueOf((long) r1.A4i().A0E.getAndIncrement());
    }

    public static void A0W(AnonymousClass1K1 r0, C36241nZ r1, AnonymousClass10E r2, AnonymousClass10G r3, MediaGalleryFragmentBase mediaGalleryFragmentBase) {
        mediaGalleryFragmentBase.A0O = C000200d.A00(r0.A4e);
        mediaGalleryFragmentBase.A0J = (AnonymousClass7FZ) r3.ADD.get();
        mediaGalleryFragmentBase.A0D = (C1600686z) r1.A1V.get();
        mediaGalleryFragmentBase.A0P = C000200d.A00(r2.AfH);
        mediaGalleryFragmentBase.A0A = (AnonymousClass11C) r2.AAp.get();
        mediaGalleryFragmentBase.A0Q = C000200d.A00(r3.AId);
        mediaGalleryFragmentBase.A0B = (AnonymousClass118) r2.ABY.get();
        mediaGalleryFragmentBase.A0C = (C219217x) r2.ABj.get();
        mediaGalleryFragmentBase.A0L = (AnonymousClass10I) r2.AC1.get();
        mediaGalleryFragmentBase.A0R = C000200d.A00(r2.A9B);
        mediaGalleryFragmentBase.A0E = (C18000vb) r2.ABz.get();
    }

    public static void A0Z(C36241nZ r1, AnonymousClass10E r2, AnonymousClass10G r3, MediaComposerFragment mediaComposerFragment) {
        C34701kw.A00(mediaComposerFragment, AnonymousClass10G.A8i(r3));
        mediaComposerFragment.A0G = (C18030ve) r2.A04.get();
        mediaComposerFragment.A05 = (AnonymousClass6a6) r1.A0p.get();
        mediaComposerFragment.A04 = (AnonymousClass190) r2.A31.get();
        mediaComposerFragment.A06 = (AnonymousClass1T1) r2.A43.get();
        mediaComposerFragment.A0F = (AnonymousClass1KW) r2.A3d.get();
        mediaComposerFragment.A0W = C000200d.A00(r1.A08);
        mediaComposerFragment.A0X = C000200d.A00(r1.A01);
        mediaComposerFragment.A07 = (AnonymousClass1KB) r2.A4b.get();
    }

    public static void A0a(C36241nZ r1, AnonymousClass10E r2, AnonymousClass10G r3, MediaComposerFragment mediaComposerFragment, AnonymousClass00S r5) {
        mediaComposerFragment.A0d = C000200d.A00(r5);
        mediaComposerFragment.A0R = (AnonymousClass1SB) r2.AAS.get();
        mediaComposerFragment.A09 = (AnonymousClass11C) r2.AAp.get();
        mediaComposerFragment.A0e = C000200d.A00(r1.A1R);
        mediaComposerFragment.A0A = (AnonymousClass11P) r2.AAv.get();
        mediaComposerFragment.A0S = AnonymousClass10E.AKo(r2);
        mediaComposerFragment.A0f = C000200d.A00(r3.AIe);
        mediaComposerFragment.A0B = (AnonymousClass118) r2.ABY.get();
        mediaComposerFragment.A0g = C000200d.A00(r2.ABd);
        mediaComposerFragment.A0C = (C219217x) r2.ABj.get();
        mediaComposerFragment.A0D = (C19830z4) r2.ABl.get();
        mediaComposerFragment.A0V = (AnonymousClass10I) r2.AC1.get();
        mediaComposerFragment.A0E = (C18000vb) r2.ABz.get();
    }

    public static void A0c(AnonymousClass10E r1, AnonymousClass10G r2, AnonymousClass10G r3, AnonymousClass1FU r4) {
        r4.A0F = (AnonymousClass1L1) r2.A45.get();
        r4.A07 = (AnonymousClass11E) r1.A2X.get();
        r4.A0B = (AnonymousClass11O) r1.ABn.get();
        r4.A0C = (AnonymousClass1L2) r3.A40.get();
    }

    public static void A0d(AnonymousClass10E r1, AnonymousClass10G r2, AnonymousClass1FU r3) {
        r3.A0F = (AnonymousClass1L1) r2.A45.get();
        r3.A07 = (AnonymousClass11E) r1.A2X.get();
        r3.A0B = (AnonymousClass11O) r1.ABn.get();
        r3.A0C = (AnonymousClass1L2) r2.A40.get();
    }

    public static void A0e(AnonymousClass10E r1, AnonymousClass10G r2, AnonymousClass1FY r3, AnonymousClass00S r4) {
        C63932tv.A08(r3, C000200d.A00(r4));
        r3.A05 = (AnonymousClass11P) r1.AAv.get();
        r3.A09 = (AnonymousClass1L4) r2.A2e.get();
        r3.A02 = (AnonymousClass11S) r1.A63.get();
        C63662tU.A01(r3, (AnonymousClass1L7) r1.A3t.get());
        r3.A0C = C000200d.A00(r1.AAV);
        r3.A01 = (AnonymousClass1L9) r1.A0E.get();
        r3.A03 = (AnonymousClass1LC) r2.A5B.get();
        C63662tU.A03(r3, C000200d.A00(r1.A0J));
        C63662tU.A04(r3, C000200d.A00(r2.A3J));
        r3.A08 = (AnonymousClass1LD) r1.A9j.get();
        r3.A07 = (AnonymousClass1CM) r1.A9V.get();
        C63662tU.A02(r3, AnonymousClass10E.A7j(r1));
    }

    public static void A0h(AnonymousClass10E r1, AnonymousClass10G r2, VideoComposerFragment videoComposerFragment) {
        videoComposerFragment.A0O = (C1403571b) r2.ABJ.get();
        videoComposerFragment.A0b = C27011Uj.A00();
        videoComposerFragment.A0c = (C18600wl) r1.A9F.get();
        videoComposerFragment.A0X = C000200d.A00(r1.AYQ);
        videoComposerFragment.A0M = (C31131f4) r1.A6M.get();
        videoComposerFragment.A0P = (C26431Sc) r1.AlU.get();
        videoComposerFragment.A0Y = C000200d.A00(r1.AmD);
    }

    public static void A0n(FaqItemActivity faqItemActivity) {
        faqItemActivity.A02 += System.currentTimeMillis() - faqItemActivity.A01;
        faqItemActivity.A01 = System.currentTimeMillis();
        faqItemActivity.setResult(-1, new Intent().putExtra("article_id", faqItemActivity.A00).putExtra("total_time_spent", faqItemActivity.A02));
    }

    public static void A0o(AnonymousClass11W r1, HttpURLConnection httpURLConnection) {
        httpURLConnection.setRequestProperty("User-Agent", r1.A02());
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(30000);
        httpURLConnection.setRequestMethod("GET");
    }

    public static void A0q(AbstractCollection abstractCollection, Iterator it) {
        Integer A03 = AnonymousClass1YD.A03(AnonymousClass1YF.A0G((String) it.next()).toString());
        if (A03 != null) {
            abstractCollection.add(A03);
        }
    }

    public static boolean A0t(AnonymousClass1FL r2, Object obj) {
        Class<?> cls;
        List A04 = r2.getSupportFragmentManager().A0U.A04();
        C18070vi.A0X(A04);
        Object A0c = C29431cG.A0c(A04);
        if (A0c == null || (cls = A0c.getClass()) == null || !cls.equals(obj)) {
            return false;
        }
        return true;
    }

    public static boolean A0u(String str, int i) {
        if (C18070vi.A00(str.charAt(i), 32) <= 0) {
            return true;
        }
        return false;
    }
}
