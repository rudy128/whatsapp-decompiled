package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog$Builder;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.whatsapp.calling.callhistory.calllog.CallLogActivityV2;
import com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel;
import com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.labelitem.view.AddToListViewModel;
import com.whatsapp.labelitem.view.bottomsheet.AddToListFragment;
import com.whatsapp.newsletter.NewsletterInfoActivity;
import com.whatsapp.settings.SettingsDataUsageActivity;
import com.whatsapp.settings.SettingsTabActivity;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;
import com.whatsapp.wds.components.textlayout.WDSTextLayout;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3MY  reason: invalid class name */
public abstract class AnonymousClass3MY {
    public static Intent A06(Context context, AnonymousClass1LU r2, AnonymousClass1BI r3) {
        return r2.A1w(context, r3, 0);
    }

    public static View A0D(LayoutInflater layoutInflater, int i) {
        return layoutInflater.inflate(i, (ViewGroup) null);
    }

    public static View A0E(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        List list = C42011xT.A0I;
        C18070vi.A0b(inflate);
        return inflate;
    }

    public static View A0F(ViewGroup viewGroup) {
        return viewGroup.getChildAt(0);
    }

    public static Integer A0f() {
        return 0;
    }

    public static Object A0l(C18140vp r1) {
        C18070vi.A0d(r1, 0);
        return r1.get();
    }

    public static String A0o(Fragment fragment, Object obj, int i, int i2) {
        Object[] objArr = new Object[1];
        objArr[i] = obj;
        return fragment.A1I(i2, objArr);
    }

    public static String A0q(C24921Me r1, AnonymousClass1E7 r2) {
        return r1.A0T(r2, -1);
    }

    public static void A1V(Object obj, Object obj2, Object[] objArr) {
        objArr[0] = obj;
        objArr[1] = obj2;
    }

    public static void A1W(Object obj, Object obj2, Object[] objArr) {
        objArr[2] = obj;
        objArr[3] = obj2;
    }

    public static void A1Z(boolean z) {
        C008303s.A00("onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0], z);
    }

    public static boolean A1a(Intent intent, String str) {
        return intent.getBooleanExtra(str, false);
    }

    public static int A00(int i, int i2) {
        if ((i & 4) != 0) {
            return 0;
        }
        return i2;
    }

    public static Context A05(View view) {
        List list = C42011xT.A0I;
        Context context = view.getContext();
        C18070vi.A0X(context);
        return context;
    }

    public static Intent A07(Uri uri) {
        return new Intent("android.intent.action.VIEW", uri);
    }

    public static LayoutInflater A0B(View view) {
        List list = C42011xT.A0I;
        return LayoutInflater.from(view.getContext());
    }

    public static AnonymousClass190 A0N(AnonymousClass10E r0) {
        return (AnonymousClass190) r0.A31.get();
    }

    public static AnonymousClass1E8 A0P(AnonymousClass1FY r0) {
        AnonymousClass11S r02 = r0.A02;
        r02.A0I();
        return r02.A0D;
    }

    public static C85334Mz A0Q(SettingsDataUsageActivity settingsDataUsageActivity) {
        return (C85334Mz) settingsDataUsageActivity.A0P.get();
    }

    public static CallLogActivityViewModel A0R(CallLogActivityV2 callLogActivityV2) {
        return (CallLogActivityViewModel) callLogActivityV2.A0a.getValue();
    }

    public static C31191fA A0S(AnonymousClass10E r0) {
        return (C31191fA) r0.A25.get();
    }

    public static AnonymousClass4OV A0T(AnonymousClass4aY r0) {
        return (AnonymousClass4OV) r0.A4x.get();
    }

    public static AnonymousClass1Q1 A0U(AnonymousClass10E r0) {
        return (AnonymousClass1Q1) r0.A2A.get();
    }

    public static AnonymousClass1MZ A0V(AnonymousClass10E r0) {
        return (AnonymousClass1MZ) r0.A4t.get();
    }

    public static AnonymousClass126 A0X(AnonymousClass10E r0) {
        return (AnonymousClass126) r0.A4h.get();
    }

    public static C25191Ng A0Y(AnonymousClass10E r0) {
        return (C25191Ng) r0.A4u.get();
    }

    public static AnonymousClass1LU A0Z(AnonymousClass10E r0) {
        return (AnonymousClass1LU) r0.ABd.get();
    }

    public static GroupJid A0a(AnonymousClass1E7 r1) {
        return (GroupJid) r1.A06(AnonymousClass1EC.class);
    }

    public static AnonymousClass1EC A0b(Jid jid) {
        C42941yz r0 = AnonymousClass1EC.A01;
        AnonymousClass1EC A00 = C42941yz.A00(jid);
        C17960vV.A07(A00);
        return A00;
    }

    public static AddToListViewModel A0c(AddToListFragment addToListFragment) {
        return (AddToListViewModel) addToListFragment.A0F.getValue();
    }

    public static C32011gU A0d(AnonymousClass10E r0) {
        return (C32011gU) r0.A5k.get();
    }

    public static C36401np A0e(AnonymousClass10G r0) {
        return (C36401np) r0.A30.get();
    }

    public static Integer A0g() {
        return 8;
    }

    public static Integer A0h() {
        return 15;
    }

    public static NullPointerException A0k() {
        return new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static C30511e4 A0s(AnonymousClass1OS r2, AnonymousClass1OX r3) {
        return C30451dy.A02(AnonymousClass00R.A00, AnonymousClass1OR.A00, r2, r3);
    }

    public static void A1E(View view, Object obj, Object obj2, int i) {
        view.setOnClickListener(new AnonymousClass6LF(obj, obj2, i));
    }

    public static void A1F(TextView textView, MessageDetailsActivity messageDetailsActivity, long j) {
        textView.setText(C64052u8.A08(messageDetailsActivity.A00, messageDetailsActivity.A05.A09(j)));
    }

    public static void A1K(AnonymousClass1F9 r1, AnonymousClass1DS r2, Object obj, int i) {
        r2.A0A(r1, new C65042vk(obj, i));
    }

    public static void A1U(AnonymousClass10I r1, Object obj, int i) {
        r1.CGF(new C21355Aik(obj, i));
    }

    public static int A01(MenuItem menuItem, int i) {
        C18070vi.A0d(menuItem, i);
        return menuItem.getItemId();
    }

    public static int A02(View view, int i) {
        return C19740yt.A00(view.getContext(), i);
    }

    public static int A03(Number number) {
        C18070vi.A0b(number);
        return number.intValue();
    }

    public static Context A04(View view) {
        Context context = view.getContext();
        C18070vi.A0X(context);
        return context;
    }

    public static Drawable A08(Context context) {
        return C24261Jm.A00(context, 2131231807);
    }

    public static Bundle A09(Activity activity) {
        return activity.getIntent().getExtras();
    }

    public static SpannableStringBuilder A0A(Context context, C36401np r1, Runnable runnable, String str, String str2) {
        SpannableStringBuilder A05 = r1.A05(context, runnable, str, str2);
        C18070vi.A0X(A05);
        return A05;
    }

    public static View A0C(Activity activity, int i) {
        View A0A = C110885hR.A0A(activity, i);
        C18070vi.A0X(A0A);
        return A0A;
    }

    public static View A0G(ViewStub viewStub, int i) {
        viewStub.setLayoutResource(i);
        return viewStub.inflate();
    }

    public static View A0H(AnonymousClass01E r0, int i) {
        View findViewById = r0.findViewById(i);
        C18070vi.A0X(findViewById);
        return findViewById;
    }

    public static View A0I(C28931bI r0, int i) {
        r0.A04(i);
        return r0.A02();
    }

    public static C003401n A0J(AnonymousClass01E r0) {
        C003401n supportActionBar = r0.getSupportActionBar();
        C17960vV.A07(supportActionBar);
        return supportActionBar;
    }

    public static C003401n A0K(AnonymousClass01E r0, Toolbar toolbar) {
        r0.setSupportActionBar(toolbar);
        return r0.getSupportActionBar();
    }

    public static C010105w A0L(AlertDialog$Builder alertDialog$Builder) {
        C010105w create = alertDialog$Builder.create();
        C18070vi.A0X(create);
        return create;
    }

    public static C93884jh A0M(Iterator it) {
        return (C93884jh) ((C107955at) it.next());
    }

    public static C27691Xc A0O(AnonymousClass009 r0) {
        return (C27691Xc) ((AnonymousClass033) r0.generatedComponent());
    }

    public static C18030ve A0W(AnonymousClass00H r0) {
        return ((AnonymousClass1c4) r0.get()).A02;
    }

    public static Integer A0i(Resources resources, int i) {
        return Integer.valueOf(resources.getDimensionPixelSize(i));
    }

    public static Integer A0j(AnonymousClass00H r0) {
        return ((AnonymousClass17C) r0.get()).A00;
    }

    public static String A0m(Resources resources, int i) {
        String string = resources.getString(i);
        C18070vi.A0X(string);
        return string;
    }

    public static String A0n(Fragment fragment, int i) {
        String A1H = fragment.A1H(i);
        C18070vi.A0X(A1H);
        return A1H;
    }

    public static String A0p(AnonymousClass1M9 r0, C24921Me r1, AnonymousClass1BI r2) {
        return r1.A0I(r0.A0H(r2));
    }

    public static String A0r(StringBuilder sb, boolean z) {
        sb.append(z);
        return sb.toString();
    }

    public static void A0t(Activity activity, int i) {
        activity.setTitle(activity.getString(i));
    }

    public static void A0u(Context context, Paint paint, TextView textView, AnonymousClass1KW r3, CharSequence charSequence) {
        textView.setText(C43251zV.A03(context, paint, r3, charSequence));
    }

    public static void A0v(Context context, View view, int i) {
        view.setBackground(C24261Jm.A00(context, i));
    }

    public static void A0w(Context context, View view, int i) {
        view.setContentDescription(context.getString(i));
    }

    public static void A0x(Context context, TextView textView, int i) {
        textView.setText(context.getString(i));
    }

    public static void A0y(Context context, TextView textView, Object[] objArr, int i) {
        textView.setText(context.getString(i, objArr));
    }

    public static void A0z(Context context, WDSTextLayout wDSTextLayout, int i) {
        wDSTextLayout.setPrimaryButtonText(context.getString(i));
    }

    public static void A10(Context context, WDSTextLayout wDSTextLayout, int i) {
        wDSTextLayout.setHeadlineText(context.getString(i));
    }

    public static void A11(Intent intent, View view) {
        view.getContext().startActivity(intent);
    }

    public static void A12(Intent intent, Jid jid, String str) {
        intent.putExtra(str, jid.getRawString());
    }

    public static void A13(Intent intent, Jid jid, String str) {
        intent.putExtra(str, C22971Dz.A06(jid));
    }

    public static void A14(Resources resources, View view, int i) {
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        view.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }

    public static void A15(BaseBundle baseBundle, Jid jid, String str) {
        baseBundle.putString(str, jid.getRawString());
    }

    public static void A16(Bundle bundle, Fragment fragment, String str) {
        fragment.A1F().A0w(str, bundle);
    }

    public static void A17(Bundle bundle, String str, Collection collection) {
        bundle.putStringArrayList(str, C22971Dz.A0B(collection));
    }

    public static void A18(Parcel parcel, Enum enumR) {
        parcel.writeString(enumR.name());
    }

    public static void A19(View view, int i) {
        view.setTag(Integer.valueOf(i));
    }

    public static void A1A(View view, int i, int i2) {
        AnonymousClass1HF.A06(view, i).setVisibility(i2);
    }

    public static void A1B(View view, int i, int i2) {
        view.findViewById(i).setVisibility(i2);
    }

    public static void A1C(View view, int i, int i2, int i3) {
        view.measure(i3, View.MeasureSpec.makeMeasureSpec(i, i2));
    }

    public static void A1D(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static void A1G(AlertDialog$Builder alertDialog$Builder) {
        alertDialog$Builder.create().show();
    }

    public static void A1H(DialogFragment dialogFragment, AnonymousClass1FL r2, String str) {
        dialogFragment.A2C(r2.getSupportFragmentManager(), str);
    }

    public static void A1I(Fragment fragment, WDSTextLayout wDSTextLayout, int i) {
        wDSTextLayout.setPrimaryButtonText(fragment.A1H(i));
    }

    public static void A1J(Fragment fragment, WDSTextLayout wDSTextLayout, int i) {
        wDSTextLayout.setHeadlineText(fragment.A1H(i));
    }

    public static void A1L(AnonymousClass1DS r1, boolean z) {
        r1.A0F(Boolean.valueOf(z));
    }

    public static void A1M(AnonymousClass1DS r1, boolean z) {
        r1.A0E(Boolean.valueOf(z));
    }

    public static void A1N(AnonymousClass10G r0, WDSBottomSheetDialogFragment wDSBottomSheetDialogFragment) {
        wDSBottomSheetDialogFragment.A00 = AnonymousClass10G.A8i(r0);
    }

    public static void A1O(AnonymousClass1M9 r0, AnonymousClass1BI r1, AbstractCollection abstractCollection) {
        abstractCollection.add(r0.A0H(r1));
    }

    public static void A1P(AnonymousClass1BI r1, C25771Po r2, int i, boolean z) {
        r2.A04(r1, i, r2.A02(), z);
    }

    public static void A1Q(NewsletterInfoActivity newsletterInfoActivity) {
        newsletterInfoActivity.A4p().get();
    }

    public static void A1R(AnonymousClass10T r1, C18100vl r2) {
        r1.unregisterObserver(r2.getValue());
    }

    public static void A1S(SettingsTabActivity settingsTabActivity, int i) {
        Integer valueOf = Integer.valueOf(i);
        int i2 = 0;
        if (settingsTabActivity.A1F) {
            i2 = 4;
        }
        ((C86014Pv) settingsTabActivity.A14.get()).A00(valueOf.intValue(), Integer.valueOf(i2));
    }

    public static void A1T(C28931bI r0, int i) {
        r0.A02().setVisibility(i);
    }

    public static void A1X(String str, TextView textView) {
        textView.setText(Html.fromHtml(str));
    }

    public static void A1Y(AnonymousClass1G4 r1, boolean z) {
        r1.setValue(Boolean.valueOf(z));
    }

    public static boolean A1b(C18000vb r0) {
        return !C18000vb.A00(r0).A06;
    }
}
