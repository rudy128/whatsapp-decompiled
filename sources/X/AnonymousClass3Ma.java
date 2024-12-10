package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingCameraFragment;
import com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingViewModel;
import com.whatsapp.calling.callconfirmationsheet.ui.CallConfirmationSheet;
import com.whatsapp.calling.callconfirmationsheet.vm.CallConfirmationSheetViewModel;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.community.communitymedia.CommunityMediaActivity;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel;
import com.whatsapp.conversation.conversationrow.InteractiveMessageButton;
import com.whatsapp.group.GroupChatInfoActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.lists.ListsManagerFragment;
import com.whatsapp.lists.ListsManagerViewModel;
import java.util.AbstractCollection;
import java.util.List;
import java.util.concurrent.CancellationException;

/* renamed from: X.3Ma  reason: invalid class name */
public abstract class AnonymousClass3Ma {
    public static Paint A07() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        return paint;
    }

    public static View A0A(C18140vp r1) {
        C18070vi.A0d(r1, 0);
        return (View) r1.get();
    }

    public static LinearLayout.LayoutParams A0D() {
        return new LinearLayout.LayoutParams(-2, -2);
    }

    public static C65482wZ A0J() {
        return new C65482wZ(0);
    }

    public static Object A0z(Object obj, AnonymousClass1JG r2) {
        C18070vi.A0d(obj, 0);
        return r2.receiver;
    }

    public static void A16(View view) {
        view.performHapticFeedback(1, 2);
    }

    public static void A17(View view) {
        view.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
    }

    public static void A1Q(C18090vk r1) {
        C18070vi.A0d(r1, 0);
        r1.invoke();
    }

    public static boolean A1Z(Object obj, Object obj2) {
        return obj != obj2;
    }

    public static int A04(GroupChatInfoActivity groupChatInfoActivity) {
        return groupChatInfoActivity.A0H.A06(groupChatInfoActivity.A1K);
    }

    public static C36361nl A0L(AnonymousClass10E r0) {
        return (C36361nl) r0.A5h.get();
    }

    public static C62572rc A0M(AnonymousClass21V r0) {
        C62572rc r02 = r0.A02;
        C17960vV.A07(r02);
        C18070vi.A0X(r02);
        return r02;
    }

    public static ImagineMeOnboardingViewModel A0O(ImagineMeOnboardingCameraFragment imagineMeOnboardingCameraFragment) {
        return (ImagineMeOnboardingViewModel) imagineMeOnboardingCameraFragment.A0O.getValue();
    }

    public static CallConfirmationSheetViewModel A0P(CallConfirmationSheet callConfirmationSheet) {
        return (CallConfirmationSheetViewModel) callConfirmationSheet.A0B.getValue();
    }

    public static MemberSuggestedGroupsManagementViewModel A0Q(MemberSuggestedGroupsManagementActivity memberSuggestedGroupsManagementActivity) {
        return (MemberSuggestedGroupsManagementViewModel) memberSuggestedGroupsManagementActivity.A0G.getValue();
    }

    public static C73373Vg A0R(CommunityMediaActivity communityMediaActivity) {
        return (C73373Vg) communityMediaActivity.A0Q.getValue();
    }

    public static C24671Lf A0S(AnonymousClass10E r0) {
        return (C24671Lf) r0.A2g.get();
    }

    public static C36531o3 A0T(AnonymousClass10E r0) {
        return (C36531o3) r0.A2n.get();
    }

    public static C32951i1 A0U(AnonymousClass10E r0) {
        return (C32951i1) r0.A28.get();
    }

    public static C86314Rd A0V(InteractiveMessageButton interactiveMessageButton) {
        return (C86314Rd) interactiveMessageButton.A0E.get();
    }

    public static AnonymousClass4SX A0W(AnonymousClass1K1 r0) {
        return (AnonymousClass4SX) r0.A0p.get();
    }

    public static C56052gp A0X(AnonymousClass4aY r0) {
        return (C56052gp) r0.A5Q.get();
    }

    public static AnonymousClass4X5 A0Y(AnonymousClass4aY r0) {
        return (AnonymousClass4X5) r0.A5l.get();
    }

    public static AnonymousClass4PK A0Z(AnonymousClass4aY r0) {
        return (AnonymousClass4PK) r0.A5Y.get();
    }

    public static AnonymousClass11C A0a(AnonymousClass10E r0) {
        return (AnonymousClass11C) r0.AAp.get();
    }

    public static C219217x A0b(AnonymousClass10E r0) {
        return (C219217x) r0.ABj.get();
    }

    public static C19830z4 A0c(AnonymousClass10E r0) {
        return (C19830z4) r0.ABl.get();
    }

    public static AnonymousClass1CJ A0d(AnonymousClass10E r0) {
        return (AnonymousClass1CJ) r0.A2H.get();
    }

    public static AnonymousClass1NN A0e(AnonymousClass10E r0) {
        return (AnonymousClass1NN) r0.A2q.get();
    }

    public static AnonymousClass1KW A0f(AnonymousClass10E r0) {
        return (AnonymousClass1KW) r0.A3d.get();
    }

    public static AnonymousClass18K A0g(AnonymousClass10E r0) {
        return (AnonymousClass18K) r0.A9B.get();
    }

    public static AnonymousClass12M A0h(AnonymousClass10E r0) {
        return (AnonymousClass12M) r0.A4w.get();
    }

    public static C42211xo A0i(AnonymousClass10E r0) {
        return (C42211xo) r0.AAd.get();
    }

    public static C24001Il A0j(AnonymousClass4aY r0) {
        return (C24001Il) r0.A64.get();
    }

    public static AnonymousClass1MB A0k(AnonymousClass10E r0) {
        return (AnonymousClass1MB) r0.AAb.get();
    }

    public static AnonymousClass1PY A0l(AnonymousClass10E r0) {
        return (AnonymousClass1PY) r0.ABh.get();
    }

    public static Jid A0m(AnonymousClass1E7 r1) {
        Jid A06 = r1.A06(AnonymousClass1EC.class);
        C17960vV.A07(A06);
        return A06;
    }

    public static AnonymousClass1EC A0n(AnonymousClass1E7 r1) {
        return (AnonymousClass1EC) r1.A06(AnonymousClass1EC.class);
    }

    public static UserJid A0o(AnonymousClass206 r1) {
        AnonymousClass1BI r12 = r1.A0v.A00;
        C22941Dw r0 = UserJid.Companion;
        return C22941Dw.A01(r12);
    }

    public static ListsManagerViewModel A0p(ListsManagerFragment listsManagerFragment) {
        return (ListsManagerViewModel) listsManagerFragment.A0E.getValue();
    }

    public static AnonymousClass1QO A0q(AnonymousClass10E r0) {
        return (AnonymousClass1QO) r0.A8G.get();
    }

    public static C18010vc A0r(AnonymousClass10E r0) {
        return (C18010vc) r0.A9s.get();
    }

    public static AnonymousClass1W6 A0s(AnonymousClass10E r0) {
        return (AnonymousClass1W6) r0.A3w.get();
    }

    public static AnonymousClass129 A0t(AnonymousClass10E r0) {
        return (AnonymousClass129) r0.A4I.get();
    }

    public static C24901Mc A0u(AnonymousClass10E r0) {
        return (C24901Mc) r0.AA5.get();
    }

    public static AnonymousClass1K3 A0v(AnonymousClass10E r0) {
        return (AnonymousClass1K3) r0.A30.get();
    }

    public static AnonymousClass1L4 A0w(AnonymousClass10G r0) {
        return (AnonymousClass1L4) r0.A2e.get();
    }

    public static String A10(Context context, Object obj, Object[] objArr, int i, int i2) {
        objArr[i] = obj;
        String string = context.getString(i2, objArr);
        C18070vi.A0X(string);
        return string;
    }

    public static void A15(Context context, RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
    }

    public static void A18(View view, int i, int i2) {
        view.setLayoutParams(new ViewGroup.MarginLayoutParams(i, i2));
    }

    public static void A19(View view, Object obj, int i) {
        view.setOnClickListener(new AFC(obj, i));
    }

    public static void A1A(View view, Object obj, int i) {
        view.setOnClickListener(new AFD(obj, i));
    }

    public static void A1B(View view, Object obj, int i) {
        view.setOnClickListener(new AnonymousClass783(obj, i));
    }

    public static void A1C(View view, Object obj, int i) {
        view.setOnClickListener(new C177649Aa(obj, i));
    }

    public static void A1D(View view, Object obj, int i) {
        view.setOnClickListener(new C177659Ab(obj, i));
    }

    public static void A1E(View view, Object obj, int i) {
        view.setOnClickListener(new AnonymousClass784(obj, i));
    }

    public static void A1F(View view, Object obj, Object obj2, Object obj3, int i) {
        view.setOnClickListener(new AnonymousClass78A(obj, obj2, obj3, i));
    }

    public static void A1G(View view, Object obj, String str, int i) {
        view.setOnClickListener(new AFV(i, str, obj));
    }

    public static void A1H(Window window, int i) {
        window.setBackgroundDrawable(new ColorDrawable(i));
    }

    public static void A1I(TextView textView, C18030ve r2) {
        textView.setMovementMethod(new C39441t5(r2));
    }

    public static void A1J(AnonymousClass1KB r1, Object obj, int i) {
        r1.A0J(new C21356Ail(obj, i));
    }

    public static void A1K(WaTextView waTextView, AnonymousClass11C r2) {
        waTextView.setAccessibilityHelper(new C39411t2(waTextView, r2));
    }

    public static void A1L(C18030ve r1, TextEmojiLabel textEmojiLabel) {
        textEmojiLabel.setLinkHandler(new C39441t5(r1));
    }

    public static void A1M(C28931bI r1) {
        if (r1 != null) {
            r1.A04(8);
        }
    }

    public static void A1P(Object obj, Object obj2, AbstractCollection abstractCollection) {
        abstractCollection.add(new C19760yx(obj, obj2));
    }

    public static void A1R(AnonymousClass1OB r1) {
        if (r1 != null) {
            r1.BEM((CancellationException) null);
        }
    }

    public static boolean A1V(AnonymousClass11S r1, AnonymousClass1E7 r2) {
        return r1.A0O(r2.A0J);
    }

    public static boolean A1X(AnonymousClass206 r0, Object obj) {
        return obj.equals(r0.A0v.A00);
    }

    public static boolean A1Y(C36451nu r2) {
        return C18020vd.A05(C18040vf.A02, r2.A00, 913);
    }

    public static int A00(Context context, int i, int i2) {
        return C19740yt.A00(context, AnonymousClass1YL.A00(context, i, i2));
    }

    public static int A01(Context context, Resources resources, int i, int i2) {
        return resources.getColor(AnonymousClass1YL.A00(context, i, i2));
    }

    public static int A02(View view, int i) {
        return view.getResources().getDimensionPixelSize(i);
    }

    public static int A03(EditText editText) {
        return editText.getText().length();
    }

    public static Activity A05(View view) {
        return AnonymousClass1L9.A00(view.getContext());
    }

    public static Resources.Theme A06(View view) {
        return view.getContext().getTheme();
    }

    public static Parcelable A08(Parcel parcel, Class cls) {
        return parcel.readParcelable(cls.getClassLoader());
    }

    public static DisplayMetrics A09(View view) {
        return view.getResources().getDisplayMetrics();
    }

    public static FrameLayout A0B(View view) {
        return new FrameLayout(view.getContext());
    }

    public static ImageView A0C(View view, int i) {
        View A06 = AnonymousClass1HF.A06(view, i);
        C18070vi.A0X(A06);
        return (ImageView) A06;
    }

    public static TextView A0E(View view, int i) {
        View A06 = AnonymousClass1HF.A06(view, i);
        C18070vi.A0X(A06);
        return (TextView) A06;
    }

    public static Toolbar A0F(Activity activity) {
        return (Toolbar) C110885hR.A0A(activity, 2131436270);
    }

    public static Toolbar A0G(AnonymousClass01E r1) {
        return (Toolbar) r1.findViewById(2131436270);
    }

    public static C34001jj A0H(AnonymousClass1FL r1) {
        return new C34001jj(r1.getSupportFragmentManager());
    }

    public static C24071It A0I(Fragment fragment) {
        return new C24071It(fragment.A1D());
    }

    public static AnonymousClass1FU A0K(View view) {
        return AnonymousClass1FU.A00(view.getContext());
    }

    public static WaTextView A0N(View view, int i) {
        View A06 = AnonymousClass1HF.A06(view, i);
        C18070vi.A0X(A06);
        return (WaTextView) A06;
    }

    public static C28931bI A0x(AnonymousClass01E r0, int i) {
        return new C28931bI(r0.findViewById(i));
    }

    public static Object A0y(Integer num, C18090vk r1) {
        return AnonymousClass1DF.A00(num, r1).getValue();
    }

    public static String A11(View view, int i) {
        return view.getContext().getString(i);
    }

    public static String A12(EditText editText) {
        return editText.getText().toString();
    }

    public static String A13(TextView textView) {
        return textView.getText().toString();
    }

    public static String A14(C25241Nl r1, Jid jid) {
        return r1.A05(jid.getRawString());
    }

    public static void A1N(Object obj, int i, Object obj2) {
        C18070vi.A0d(obj, i);
        C18070vi.A0d(obj2, 1);
    }

    public static void A1O(Object obj, int i, Object obj2) {
        C18070vi.A0d(obj, i);
        C18070vi.A0d(obj2, 3);
    }

    public static void A1S(Object[] objArr, int i) {
        objArr[2] = Integer.valueOf(i);
    }

    public static void A1T(Object[] objArr, int i) {
        objArr[4] = Integer.valueOf(i);
    }

    public static void A1U(Object[] objArr, int i) {
        objArr[5] = Integer.valueOf(i);
    }

    public static boolean A1W(ContactInfoActivity contactInfoActivity) {
        return C22971Dz.A0S(contactInfoActivity.A4l());
    }

    public static boolean A1a(Object obj, List list, int i) {
        return C18070vi.A18(obj, list.get(i));
    }

    public static boolean A1b(List list, int i) {
        return list.contains(Integer.valueOf(i));
    }
}
