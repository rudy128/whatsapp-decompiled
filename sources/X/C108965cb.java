package X;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.Me;
import com.whatsapp.WaEditText;
import com.whatsapp.WaImageView;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.bot.botmemory.MemoryActivity;
import com.whatsapp.bot.botmemory.MemoryViewModel;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsFragment;
import com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsViewModel;
import com.whatsapp.expressionstray.search.ExpressionsSearchView;
import com.whatsapp.expressionstray.search.ExpressionsSearchViewModel;
import com.whatsapp.flows.webview.bridge.FlowsWebViewDataRepository;
import com.whatsapp.gallery.GalleryTabHostFragment;
import com.whatsapp.gallery.viewmodel.GalleryTabsViewModel;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.migration.export.ui.ExportMigrationActivity;
import com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment;
import com.whatsapp.status.playback.MessageReplyActivity;
import com.whatsapp.stickers.info.bottomsheet.StickerInfoBottomSheet;
import com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel;
import com.whatsapp.stickers.store.StickerStoreTabFragment;
import com.whatsapp.thunderstorm.ThunderstormConnectionsInfoActivity;
import com.whatsapp.usercontrol.view.UserControlBaseFragment;
import com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;
import java.io.File;
import java.text.Collator;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: X.5cb  reason: invalid class name and case insensitive filesystem */
public abstract class C108965cb {
    public static RectF A04(float f, float f2) {
        return new RectF(0.0f, 0.0f, f, f2);
    }

    public static View A09(C42011xT r1, Object obj) {
        C18070vi.A0d(obj, 0);
        return r1.A0H;
    }

    public static CIZ A0C(Context context, GestureDetector.OnGestureListener onGestureListener) {
        return new CIZ(context, onGestureListener, (Handler) null);
    }

    public static AnonymousClass205 A0U(AnonymousClass206 r1) {
        C18070vi.A0d(r1, 0);
        return r1.A0v;
    }

    public static AtomicBoolean A0w() {
        return new AtomicBoolean(false);
    }

    public static void A0z(Context context, RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
    }

    public static void A18(AnonymousClass1FU r1, int i, int i2) {
        r1.BhU(new Object[0], i, i2);
    }

    public static void A1E(AnonymousClass184 r2, AnonymousClass18K r3) {
        r3.CC0(r2, new C18180vt(1, 1), true);
    }

    public static int A00(Pair pair) {
        return ((Number) pair.second).intValue();
    }

    public static int A01(Pair pair) {
        return ((Number) pair.first).intValue();
    }

    public static D49 A0E(C26378Cye cye) {
        return (D49) cye.A08.get();
    }

    public static C1593684g A0F(AnonymousClass73G r0) {
        return (C1593684g) r0.A0F.getValue();
    }

    public static C218617r A0G(AnonymousClass10E r0) {
        return (C218617r) r0.A8v.get();
    }

    public static AnonymousClass181 A0H(AnonymousClass10E r0) {
        return (AnonymousClass181) r0.AA9.get();
    }

    public static MemoryViewModel A0J(MemoryActivity memoryActivity) {
        return (MemoryViewModel) memoryActivity.A08.getValue();
    }

    public static C24771Lp A0K(AnonymousClass10E r0) {
        return (C24771Lp) r0.A0o.get();
    }

    public static AnonymousClass74J A0L(MessageReplyActivity messageReplyActivity) {
        return (AnonymousClass74J) messageReplyActivity.A1J.get();
    }

    public static AvatarExpressionsViewModel A0M(AvatarExpressionsFragment avatarExpressionsFragment) {
        return (AvatarExpressionsViewModel) avatarExpressionsFragment.A0V.getValue();
    }

    public static ExpressionsSearchViewModel A0N(ExpressionsSearchView expressionsSearchView) {
        return (ExpressionsSearchViewModel) expressionsSearchView.A0T.getValue();
    }

    public static GalleryTabsViewModel A0P(GalleryTabHostFragment galleryTabHostFragment) {
        return (GalleryTabsViewModel) galleryTabHostFragment.A0o.getValue();
    }

    public static C160938Ar A0R(Object obj) {
        C160938Ar r1 = (C160938Ar) obj;
        C18070vi.A0d(r1, 1);
        return r1;
    }

    public static C193099pX A0S(ExportMigrationActivity exportMigrationActivity) {
        return (C193099pX) exportMigrationActivity.A0K.get();
    }

    public static AnonymousClass1c4 A0T(AnonymousClass10E r0) {
        return (AnonymousClass1c4) r0.A7C.get();
    }

    public static C122936Sm A0V(Object obj) {
        C122936Sm r1 = (C122936Sm) obj;
        C18070vi.A0d(r1, 0);
        return r1;
    }

    public static AnonymousClass1VD A0W(ContactPickerFragment contactPickerFragment) {
        return (AnonymousClass1VD) contactPickerFragment.A2k.get();
    }

    public static C24641Lc A0X(AnonymousClass10E r0) {
        return (C24641Lc) r0.AAB.get();
    }

    public static C63742tc A0Y(C32741hg r0) {
        return (C63742tc) r0.A0N.get();
    }

    public static C32741hg A0Z(AnonymousClass10E r0) {
        return (C32741hg) r0.AAL.get();
    }

    public static C26631Sw A0a(AnonymousClass10E r0) {
        return (C26631Sw) r0.AAO.get();
    }

    public static AnonymousClass725 A0b(StickerStoreTabFragment stickerStoreTabFragment, int i) {
        return (AnonymousClass725) stickerStoreTabFragment.A0J.get(i);
    }

    public static StickerInfoViewModel A0c(StickerInfoBottomSheet stickerInfoBottomSheet) {
        return (StickerInfoViewModel) stickerInfoBottomSheet.A0X.getValue();
    }

    public static AnonymousClass73G A0d(ThunderstormConnectionsInfoActivity thunderstormConnectionsInfoActivity) {
        return (AnonymousClass73G) thunderstormConnectionsInfoActivity.A0L.getValue();
    }

    public static UserControlMessageLevelViewModel A0e(UserControlBaseFragment userControlBaseFragment) {
        return (UserControlMessageLevelViewModel) userControlBaseFragment.A0C.getValue();
    }

    public static C20050A4v A0f(MediaComposerActivity mediaComposerActivity) {
        return (C20050A4v) mediaComposerActivity.A14.get();
    }

    public static C139996zm A0g(C35081lc r0) {
        return (C139996zm) r0.A0A.get();
    }

    public static C35511mM A0h(AnonymousClass10E r0) {
        return (C35511mM) r0.A4L.get();
    }

    public static AnonymousClass00H A0i(AnonymousClass10G r0) {
        return C000200d.A00(r0.A1c);
    }

    public static Integer A0k(C18020vd r1, int i) {
        return Integer.valueOf(C18020vd.A00(C18040vf.A02, r1, i));
    }

    public static String A0p(Me me) {
        return AnonymousClass1K3.A01(me.cc, me.number);
    }

    public static ArrayList A0s(Object obj) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        return arrayList;
    }

    public static List A0v(CharSequence charSequence, String str, int i) {
        return new C41661wr(str).A01(charSequence, i);
    }

    public static void A11(Paint paint, PorterDuff.Mode mode) {
        paint.setXfermode(new PorterDuffXfermode(mode));
    }

    public static void A12(View view, int i) {
        view.setLayoutParams(new FrameLayout.LayoutParams(i, i));
    }

    public static void A13(AnonymousClass1F9 r1, AnonymousClass1DS r2, Object obj, int i) {
        r2.A0A(r1, new C91614fy(obj, i));
    }

    public static void A15(AnonymousClass10E r0, WaDialogFragment waDialogFragment) {
        waDialogFragment.A03 = AnonymousClass10G.A8i(r0.A00);
    }

    public static void A16(AnonymousClass10E r0, WDSBottomSheetDialogFragment wDSBottomSheetDialogFragment) {
        wDSBottomSheetDialogFragment.A00 = AnonymousClass10G.A8i(r0.A00);
    }

    public static void A19(AnonymousClass1KB r1, Object obj, int i) {
        r1.A0J(new C70563Bp(obj, i));
    }

    public static void A1A(AnonymousClass1KB r1, Object obj, Object obj2, int i) {
        r1.A0J(new C21451AkI(obj, obj2, i));
    }

    public static void A1B(WaEditText waEditText) {
        if (waEditText != null) {
            waEditText.A0H();
            waEditText.clearFocus();
        }
    }

    public static void A1C(C1606789m r1, String str) {
        r1.Bsw(new IllegalStateException(str));
    }

    public static void A1D(C1606789m r1, String str) {
        r1.Bsw(new IllegalArgumentException(str));
    }

    public static void A1G(C29591cX r0, C29591cX r1, byte[] bArr) {
        r0.A01 = bArr;
        r1.A05(r0.A03());
    }

    public static void A1H(C29591cX r1, String str, int i) {
        r1.A04(new AnonymousClass1MD(str, i));
    }

    public static void A1I(C29591cX r1, String str, long j) {
        r1.A04(new AnonymousClass1MD(str, j));
    }

    public static void A1K(C200710s r1, Object obj, Object obj2, Object obj3, int i) {
        r1.execute(new C70773Cl(obj, obj2, obj3, i));
    }

    public static void A1M(Object obj) {
        ((ViewPropertyAnimator) obj).setListener((Animator.AnimatorListener) null);
    }

    public static void A1N(Object obj) {
        ((View) obj).setVisibility(8);
    }

    public static void A1Q(Object obj, Object obj2, AbstractCollection abstractCollection) {
        abstractCollection.add(new Pair(obj, obj2));
    }

    public static boolean A1Y(StatusAudienceSelectorShareSheetFragment statusAudienceSelectorShareSheetFragment) {
        C24641Lc r0 = statusAudienceSelectorShareSheetFragment.A0D;
        if (r0 != null) {
            return C18020vd.A05(C18040vf.A01, r0.A01, 10229);
        }
        C18070vi.A11("statusConfig");
        throw null;
    }

    public static SharedPreferences.Editor A02(C25611Cir cir) {
        return C25611Cir.A00(cir).edit();
    }

    public static Configuration A03(Context context) {
        return context.getResources().getConfiguration();
    }

    public static BitmapDrawable A05(Bitmap bitmap, View view) {
        return new BitmapDrawable(view.getResources(), bitmap);
    }

    public static Uri.Builder A06(File file) {
        return Uri.fromFile(file).buildUpon();
    }

    public static DisplayMetrics A07() {
        return Resources.getSystem().getDisplayMetrics();
    }

    public static DisplayMetrics A08(Context context) {
        return context.getResources().getDisplayMetrics();
    }

    public static ViewGroup.LayoutParams A0A(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C18070vi.A0z(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        return layoutParams;
    }

    public static Window A0B(Fragment fragment) {
        return fragment.A1D().getWindow();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.1DT, X.1DS] */
    public static AnonymousClass1DT A0D(int i) {
        return new AnonymousClass1DS(Integer.valueOf(i));
    }

    public static WaImageView A0I(View view, int i) {
        View A06 = AnonymousClass1HF.A06(view, i);
        C18070vi.A0X(A06);
        return (WaImageView) A06;
    }

    public static C195719tn A0O(AnonymousClass00H r0) {
        return ((FlowsWebViewDataRepository) r0.get()).A00;
    }

    public static AnonymousClass1BI A0Q(Intent intent, C22931Dv r1, String str) {
        return r1.A02(intent.getStringExtra(str));
    }

    public static AnonymousClass00H A0j(AnonymousClass10G r0) {
        return C000200d.A00(r0.A1h);
    }

    public static Long A0l(SharedPreferences sharedPreferences, String str, long j) {
        return Long.valueOf(sharedPreferences.getLong(str, j));
    }

    public static Long A0m(String str) {
        return Long.valueOf(Long.parseLong(str));
    }

    public static Object A0n(AbstractMap abstractMap, long j) {
        return abstractMap.get(Long.valueOf(j));
    }

    public static Object A0o(Map map, long j) {
        return map.get(Long.valueOf(j));
    }

    public static String A0q(AnonymousClass11P r1, C18000vb r2, long j) {
        return C64052u8.A08(r2, r1.A09(j));
    }

    public static Collator A0r(C18000vb r0) {
        return Collator.getInstance(r0.A0N());
    }

    public static ArrayList A0t(Object obj) {
        C18070vi.A0X(obj);
        return new ArrayList();
    }

    public static Iterator A0u(AnonymousClass1FU r0) {
        return r0.A3W().iterator();
    }

    public static JSONObject A0x(Object obj, String str, JSONObject jSONObject) {
        jSONObject.put(str, obj);
        return new JSONObject();
    }

    public static void A0y(Activity activity) {
        activity.finish();
        activity.overridePendingTransition(0, 0);
    }

    public static void A10(Intent intent, Collection collection) {
        intent.putExtra("jids", C22971Dz.A0B(collection));
    }

    public static void A14(C38391rD r0, RecyclerView recyclerView) {
        recyclerView.setAdapter(r0);
        recyclerView.setItemAnimator((C37961qT) null);
    }

    public static void A17(AnonymousClass1FU r2) {
        r2.CNB(2131894782, 2131895077);
    }

    public static void A1F(AnonymousClass184 r1, AnonymousClass00H r2) {
        ((AnonymousClass18K) r2.get()).CC7(r1);
    }

    public static void A1J(C134226qF r1, AnonymousClass00H r2) {
        ((AnonymousClass2LK) r2.get()).registerObserver(r1);
    }

    public static void A1L(AnonymousClass00H r0, Object obj) {
        ((AnonymousClass10T) r0.get()).unregisterObserver(obj);
    }

    public static void A1O(Object obj, int i, Object obj2) {
        C18070vi.A0d(obj, i);
        C18070vi.A0d(obj2, 6);
    }

    public static void A1P(Object obj, int i, Object obj2) {
        C18070vi.A0d(obj, i);
        C18070vi.A0d(obj2, 8);
    }

    public static void A1R(Object obj, StringBuilder sb) {
        sb.append(obj);
        sb.append(", contact=");
    }

    public static void A1S(Object obj, StringBuilder sb) {
        sb.append(obj);
        sb.append(", section=");
    }

    public static void A1T(Object obj, StringBuilder sb) {
        sb.append(obj);
        sb.append(", isLoading=");
    }

    public static void A1U(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(", accessibilityLabel=");
    }

    public static boolean A1V(View view, Object obj) {
        return C18070vi.A18(obj, view.getTag());
    }

    public static boolean A1W(AnonymousClass1DS r0, Object obj) {
        return obj.equals(r0.A06());
    }

    public static boolean A1X(AnonymousClass11C r0) {
        return AnonymousClass1Y5.A0D(r0.A0M());
    }

    public static boolean A1Z(AbstractCollection abstractCollection, int i) {
        return abstractCollection.contains(Integer.valueOf(i));
    }

    public static boolean A1a(Map map, int i) {
        return map.containsKey(Integer.valueOf(i));
    }

    public static boolean A1b(Set set, int i) {
        return set.contains(Integer.valueOf(i));
    }
}
