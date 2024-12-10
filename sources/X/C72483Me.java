package X;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.BulletSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.RoundedBottomSheetDialogFragment;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.backup.encryptedbackup.EncBackupViewModel;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.chatinfo.view.custom.CollapsingProfilePhotoView;
import com.whatsapp.components.TextAndDateLayout;
import com.whatsapp.conversation.ConversationListView;
import com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView;
import com.whatsapp.ephemeral.Hilt_EphemeralDmKicBottomSheetDialog;
import com.whatsapp.group.GroupChatInfoActivity;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.privacy.checkup.PrivacyCheckupBaseFragment;
import com.whatsapp.product.newsletterenforcements.newsletterimpact.NewsletterImpactFragment;
import com.whatsapp.settings.SettingsChat;
import com.whatsapp.text.AutoSizeTextView;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;
import java.io.File;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;

/* renamed from: X.3Me  reason: invalid class name and case insensitive filesystem */
public abstract class C72483Me {
    public static int A08(int[] iArr, int i) {
        iArr[0] = AnonymousClass1Z2.A06(i, 255);
        iArr[1] = AnonymousClass1Z2.A06(i, 255);
        return AnonymousClass1Z2.A06(i, 178);
    }

    public static ValueAnimator A09(int i, int i2) {
        return ValueAnimator.ofInt(new int[]{i, i2});
    }

    public static Point A0E(MotionEvent motionEvent, View view) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new Point(((int) x) + iArr[0], ((int) y) + iArr[1]);
    }

    public static Rect A0F(CircularProgressBar circularProgressBar) {
        circularProgressBar.A0G = null;
        circularProgressBar.getContext();
        circularProgressBar.A0E = C43421zm.A02();
        circularProgressBar.A06 = 5.0f;
        circularProgressBar.A0I = false;
        circularProgressBar.A05 = 0.3f;
        circularProgressBar.A09 = 0;
        return new Rect();
    }

    public static View A0K(ViewGroup viewGroup) {
        View childAt = viewGroup.getChildAt(0);
        childAt.setVisibility(0);
        childAt.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 51));
        return viewGroup.getChildAt(1);
    }

    public static String A0W(Resources resources, int i, int i2) {
        return resources.getQuantityString(i2, i, new Object[]{Integer.valueOf(i)});
    }

    public static void A0b(Activity activity) {
        activity.getWindow().addFlags(Integer.MIN_VALUE);
        activity.getWindow().setStatusBarColor(0);
        activity.getWindow().setNavigationBarColor(C19740yt.A00(activity, AnonymousClass1YL.A00(activity, 2130968798, 2131099872)));
    }

    public static void A0f(Context context, RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        recyclerView.setItemAnimator(new C37981qV());
    }

    public static void A0g(Intent intent, AnonymousClass1FU r4, File file) {
        intent.putExtra("android.intent.extra.STREAM", C64062u9.A02(r4.getApplicationContext(), file));
        intent.setType("image/png");
        intent.addFlags(524288);
        r4.A3q(Intent.createChooser(intent, (CharSequence) null), false);
    }

    public static void A0n(View view, Object obj) {
        C18070vi.A0d(obj, 0);
        C18070vi.A0b(view);
        view.performHapticFeedback(1, 2);
    }

    public static void A10(C222219b r2, Object obj) {
        r2.A04 = true;
        r2.A00(obj.getClass().getSimpleName(), 18);
    }

    public static void A13(C139436yq r3) {
        C18070vi.A0d(r3, 0);
        r3.A00(new AnonymousClass6P4((C18090vk) null, (AnonymousClass1Y1) null, 1));
    }

    public static void A19(float[] fArr, float f) {
        fArr[1] = f;
        fArr[2] = f;
        fArr[3] = f;
        fArr[4] = f;
        fArr[5] = f;
        fArr[6] = f;
        fArr[7] = f;
    }

    public static boolean A1B(CollapsingProfilePhotoView collapsingProfilePhotoView) {
        collapsingProfilePhotoView.A04 = -1;
        collapsingProfilePhotoView.A00 = -1.0f;
        collapsingProfilePhotoView.A05 = 0;
        collapsingProfilePhotoView.A03 = 0;
        collapsingProfilePhotoView.A02 = 0;
        collapsingProfilePhotoView.A0C = true;
        return false;
    }

    public static boolean A1E(Object obj, SortedSet sortedSet, C22821Di r4, AnonymousClass1G4 r5) {
        C18070vi.A0d(sortedSet, 0);
        TreeSet treeSet = new TreeSet(sortedSet.comparator());
        treeSet.addAll(sortedSet);
        r4.invoke(treeSet);
        return r5.BFK(obj, treeSet);
    }

    public static int A01() {
        return (3 << 16) | (48 << 8) | (51 << 0);
    }

    public static int A02(Activity activity) {
        Point point = new Point();
        Rect rect = new Rect();
        activity.getWindowManager().getDefaultDisplay().getSize(point);
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return point.y - rect.top;
    }

    public static int A04(Layout layout, TextAndDateLayout textAndDateLayout) {
        int i = textAndDateLayout.A00;
        if (i == 0) {
            return layout.getLineCount() - 1;
        }
        return Math.min(i - 1, layout.getLineCount() - 1);
    }

    public static int A07(Iterable iterable) {
        int A03 = C200610r.A03(C29351c6.A0C(iterable, 10));
        if (A03 < 16) {
            return 16;
        }
        return A03;
    }

    public static Context A0A(AnonymousClass172 r2) {
        Context context = (Context) AnonymousClass114.A00.get();
        AnonymousClass114.A02(r2.BYe().BSy());
        AnonymousClass12Q.A05(r2);
        return context;
    }

    public static Intent A0B(Context context, String str, int i) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), str);
        intent.putExtra("source_surface", i);
        return intent;
    }

    public static Intent A0C(Context context, boolean z) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity");
        className.putExtra("edit_mode", z);
        return className;
    }

    public static Point A0D(Activity activity) {
        Point point = new Point();
        activity.getWindowManager().getDefaultDisplay().getSize(point);
        return point;
    }

    public static ShapeDrawable A0H(int i, int i2, int i3) {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setPadding(new Rect(i, i, i, i));
        shapeDrawable.getPaint().setColor(i2);
        float f = (float) i;
        shapeDrawable.getPaint().setShadowLayer(f, 0.0f, f * 0.25f, i3);
        return shapeDrawable;
    }

    public static Bundle A0I(int i, int i2, int i3) {
        Bundle bundle = new Bundle();
        bundle.putInt("dialogId", i);
        bundle.putInt("currentIndex", i2);
        bundle.putInt("dialogTitleResId", i3);
        return bundle;
    }

    public static AnimationSet A0L(float f, float f2) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, f, 1.0f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setRepeatCount(-1);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.75f, 0.0f);
        alphaAnimation.setRepeatCount(-1);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setRepeatMode(1);
        animationSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animationSet.setDuration(1500);
        return animationSet;
    }

    public static TextView A0N(NewsletterImpactFragment newsletterImpactFragment) {
        ((ImageView) newsletterImpactFragment.A04.getValue()).setImageResource(2131233217);
        ((ImageView) newsletterImpactFragment.A07.getValue()).setImageResource(2131233217);
        ((TextView) newsletterImpactFragment.A05.getValue()).setText(2131892671);
        return (TextView) newsletterImpactFragment.A08.getValue();
    }

    public static C25811Ps A0S(AnonymousClass4aY r0) {
        return (C25811Ps) ((C56252hA) r0.A4u.get()).A0B.get();
    }

    public static C178119Bw A0U(AnonymousClass1TD r5, C89444cT r6) {
        UserJid userJid = r6.A01;
        boolean z = r6.A03;
        return r5.A07(new C89444cT(r6.A00, userJid, r6.A02, z));
    }

    public static Integer A0V(AnonymousClass4aY r3) {
        AnonymousClass126 groupChatManager = r3.A2Q.getGroupChatManager();
        AnonymousClass1BI r1 = r3.A3R;
        C36321nh r0 = GroupJid.Companion;
        return Integer.valueOf(groupChatManager.A0O.A08.A0A(C36321nh.A00(r1)));
    }

    public static String A0Y(String str, Locale locale, long j) {
        String format = new SimpleDateFormat(str, locale).format(new Date(j));
        C18070vi.A0X(format);
        return format;
    }

    public static ArrayList A0Z(String str, List list, List list2) {
        return AnonymousClass1ZU.A06(new C59552mU(str, ".nonnull", list, list2));
    }

    public static List A0a(AnonymousClass4aY r3, AnonymousClass1E7 r4) {
        C108865cQ r0 = r3.A2Q;
        return C63982u1.A04(r0.getMeManager(), r3.A2Q.getContactManager(), r0.getGroupParticipantsManager(), r4);
    }

    public static void A0d(Context context, TextView textView, CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new BulletSpan((int) context.getResources().getDimension(2131168634)), 0, spannableStringBuilder.length(), 0);
        textView.setText(spannableStringBuilder);
    }

    public static void A0e(Context context, C003401n r4) {
        View view = new View(context);
        if (r4.A0B() == null) {
            r4.A0Q(view, new AnonymousClass039(-1, -1));
        }
    }

    public static void A0h(Intent intent, Jid jid, Serializable serializable, Serializable serializable2) {
        intent.putExtra("message_types", serializable);
        intent.putExtra("forward", serializable2);
        if (jid != null) {
            intent.putExtra("forward_jid", jid.getRawString());
        }
    }

    public static void A0j(Rect rect) {
        rect.left /= 2;
        rect.right /= 2;
        rect.top /= 2;
        rect.bottom /= 2;
    }

    public static void A0l(Parcelable parcelable, AnonymousClass1GP r4, int i) {
        Hilt_EphemeralDmKicBottomSheetDialog hilt_EphemeralDmKicBottomSheetDialog = new Hilt_EphemeralDmKicBottomSheetDialog();
        Bundle bundle = new Bundle();
        bundle.putParcelable("chat_jid", parcelable);
        bundle.putInt("entry_point", i);
        hilt_EphemeralDmKicBottomSheetDialog.A1R(bundle);
        hilt_EphemeralDmKicBottomSheetDialog.A2C(r4, "ephemeral_kic_nux");
    }

    public static void A0p(C36241nZ r1, AnonymousClass10G r2, C18030ve r3, PrivacyCheckupBaseFragment privacyCheckupBaseFragment) {
        privacyCheckupBaseFragment.A00 = r3;
        privacyCheckupBaseFragment.A02 = C000200d.A00(r2.A00);
        privacyCheckupBaseFragment.A03 = C000200d.A00(r1.A2O.A5X);
    }

    public static void A0q(AnonymousClass10E r1, AnonymousClass1FU r2) {
        r2.A05 = (AnonymousClass10I) r1.AC1.get();
        r2.A09 = (AnonymousClass11P) r1.AAv.get();
        r2.A0E = (C18030ve) r1.A04.get();
        r2.A05 = (AnonymousClass1KB) r1.A4b.get();
        r2.A03 = (AnonymousClass190) r1.A31.get();
        r2.A04 = (C218617r) r1.A8v.get();
        r2.A0D = (AnonymousClass1KW) r1.A3d.get();
        r2.A06 = (AnonymousClass18O) r1.A9p.get();
        r2.A08 = (AnonymousClass11C) r1.AAp.get();
        r2.A0A = (C19830z4) r1.ABl.get();
    }

    public static void A0r(AnonymousClass10E r1, TextEmojiLabel textEmojiLabel) {
        textEmojiLabel.A02 = (AnonymousClass1KW) r1.A3d.get();
        textEmojiLabel.A01 = (AnonymousClass1L2) r1.A00.A40.get();
        textEmojiLabel.A03 = (C18010vc) r1.A9s.get();
    }

    public static void A0s(AnonymousClass10E r1, WaTextView waTextView) {
        waTextView.A04 = (C18030ve) r1.A04.get();
        waTextView.A02 = (AnonymousClass11C) r1.AAp.get();
        waTextView.A03 = (C18000vb) r1.ABz.get();
    }

    public static void A0t(AnonymousClass10E r1, WaDialogFragment waDialogFragment) {
        waDialogFragment.A02 = (C18030ve) r1.A04.get();
        waDialogFragment.A04 = (AnonymousClass10I) r1.AC1.get();
        waDialogFragment.A01 = (C18000vb) r1.ABz.get();
    }

    public static void A0u(AnonymousClass10E r1, WaDialogFragment waDialogFragment) {
        waDialogFragment.A02 = (C18030ve) r1.A04.get();
        waDialogFragment.A04 = (AnonymousClass10I) r1.AC1.get();
        waDialogFragment.A01 = (C18000vb) r1.ABz.get();
        C63402t1.A02(waDialogFragment, AnonymousClass10G.A8i(r1.A00));
    }

    public static void A0z(AnonymousClass1MZ r2, C81453zG r3, Object obj) {
        int A09 = r2.A08.A09((AnonymousClass1E9) obj);
        int i = 4;
        if (A09 < 4) {
            i = 1;
        } else if (A09 < 8) {
            i = 2;
        } else if (A09 < 16) {
            i = 3;
        } else if (A09 >= 32) {
            i = 5;
            if (A09 >= 64) {
                i = 6;
                if (A09 >= 128) {
                    i = 7;
                    if (A09 >= 256) {
                        i = 8;
                        if (A09 >= 512) {
                            i = 9;
                            if (A09 >= 1000) {
                                i = 10;
                                if (A09 >= 1500) {
                                    i = 11;
                                    if (A09 >= 2000) {
                                        i = 12;
                                        if (A09 >= 2500) {
                                            i = 13;
                                            if (A09 >= 3000) {
                                                i = 14;
                                                if (A09 >= 3500) {
                                                    i = 15;
                                                    if (A09 >= 4000) {
                                                        i = 16;
                                                        if (A09 >= 4500) {
                                                            i = 18;
                                                            if (A09 < 5000) {
                                                                i = 17;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        r3.A02 = Integer.valueOf(i);
    }

    public static void A11(SettingsChat settingsChat, int i) {
        settingsChat.A02.toggle();
        AnonymousClass11O r3 = settingsChat.A0B;
        SharedPreferences.Editor putBoolean = r3.A00.edit().putBoolean("otp_split_mode_user_choice", settingsChat.A02.isChecked());
        if (i != 0) {
            putBoolean.apply();
        } else {
            putBoolean.commit();
        }
    }

    public static void A14(Object obj, Object obj2) {
        ContactInfoActivity contactInfoActivity = (ContactInfoActivity) obj;
        if (obj2.equals(contactInfoActivity.A4l())) {
            ContactInfoActivity.A18(contactInfoActivity);
        }
    }

    public static void A15(Object obj, Object obj2, Object obj3, Object obj4) {
        C18070vi.A0d(obj, 28);
        C18070vi.A0d(obj2, 29);
        C18070vi.A0d(obj3, 30);
        C18070vi.A0d(obj4, 31);
    }

    public static boolean A1A(TextEmojiLabel textEmojiLabel, C18030ve r2) {
        textEmojiLabel.setLinkHandler(new C39441t5(r2));
        textEmojiLabel.setAutoLinkMask(0);
        textEmojiLabel.setLinksClickable(false);
        textEmojiLabel.setFocusable(false);
        textEmojiLabel.setClickable(false);
        return false;
    }

    public static boolean A1C(AnonymousClass4aY r3) {
        AnonymousClass1BI r1 = r3.A3R;
        C22941Dw r0 = UserJid.Companion;
        return ((C37551pj) r3.A4s.get()).A0P(C22941Dw.A01(r1));
    }

    public static boolean A1D(GroupChatInfoActivity groupChatInfoActivity) {
        return ((C32171gl) ((C19880zA) groupChatInfoActivity.A1z.get()).A03()).Bey(groupChatInfoActivity.A1K);
    }

    public static float A00(ValueAnimator valueAnimator, int i) {
        C18070vi.A0d(valueAnimator, i);
        Object animatedValue = valueAnimator.getAnimatedValue();
        C18070vi.A0z(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        return ((Number) animatedValue).floatValue();
    }

    public static int A03(Context context) {
        return C28281Zt.A00(context, 2130971147, AnonymousClass1YL.A00(context, 2130971195, 2131102531));
    }

    public static int A05(View view, int i) {
        Object tag = AnonymousClass1HF.A06(view, i).getTag();
        C18070vi.A0z(tag, "null cannot be cast to non-null type kotlin.Int");
        return ((Number) tag).intValue();
    }

    public static int A06(C178119Bw r1) {
        if (r1.A0Q()) {
            return 45;
        }
        if (r1.A0N()) {
            return 47;
        }
        return 46;
    }

    public static RectF A0G(ConversationRowImage$RowImageView conversationRowImage$RowImageView) {
        conversationRowImage$RowImageView.A03();
        conversationRowImage$RowImageView.A0I = false;
        conversationRowImage$RowImageView.A0G = false;
        conversationRowImage$RowImageView.A01 = 0;
        conversationRowImage$RowImageView.A00 = 0;
        conversationRowImage$RowImageView.A0H = false;
        conversationRowImage$RowImageView.A03 = 0;
        conversationRowImage$RowImageView.A02 = 0;
        conversationRowImage$RowImageView.A0K = true;
        return new RectF();
    }

    public static SpannableStringBuilder A0J(Paint paint, AnonymousClass11C r4, C18010vc r5, CharSequence charSequence) {
        return new SpannableStringBuilder(C26302CxJ.A02(charSequence, paint.getTextSize(), -16777216, C26302CxJ.A00(r4, r5), false));
    }

    public static LinearLayout.LayoutParams A0M(View view) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, view.getResources().getDimensionPixelSize(2131166133));
        layoutParams.gravity = 1;
        return layoutParams;
    }

    public static C199410f A0O(C63872tp r1) {
        if (r1.A0U()) {
            return C199410f.copyOf(r1.A08.values());
        }
        return r1.A0B();
    }

    public static AnonymousClass10E A0P(WaImageView waImageView) {
        AnonymousClass10E r1 = ((C27691Xc) ((AnonymousClass033) waImageView.generatedComponent())).A10;
        waImageView.A00 = (C18000vb) r1.ABz.get();
        return r1;
    }

    public static AnonymousClass10E A0Q(AnonymousClass6FZ r2) {
        C27691Xc r1 = (C27691Xc) ((AnonymousClass033) r2.generatedComponent());
        r2.A00 = (C108355bZ) r1.A0z.A5a.get();
        return r1.A10;
    }

    public static EncBackupViewModel A0R(Fragment fragment) {
        return (EncBackupViewModel) new C24071It(fragment.A1D()).A00(EncBackupViewModel.class);
    }

    public static C34691kv A0T(AnonymousClass009 r0) {
        return AnonymousClass10G.A8i(((C36241nZ) ((C008903z) r0.generatedComponent())).A2Q.A00);
    }

    public static String A0X(Object obj, String str, StringBuilder sb, AbstractMap abstractMap, AbstractMap abstractMap2) {
        sb.append(str);
        sb.append(obj);
        sb.append("/");
        sb.append(Arrays.deepToString(abstractMap.keySet().toArray()));
        sb.append("/");
        return Arrays.deepToString(abstractMap2.keySet().toArray());
    }

    public static void A0c(Context context, Context context2, Object[] objArr) {
        objArr[0] = AnonymousClass1EG.A03(context2, AnonymousClass1YL.A00(context, 2130968583, 2131099679));
    }

    public static void A0i(Canvas canvas, Paint paint, Drawable drawable, float f, int i) {
        canvas.save();
        Rect bounds = drawable.getBounds();
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        canvas.translate(f, ((float) i) + (((fontMetrics.ascent + fontMetrics.descent) - ((float) bounds.height())) / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [com.whatsapp.base.WaDialogFragment, com.whatsapp.community.CommunityAdminDialogFragment, androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment] */
    public static void A0k(Bundle bundle, AnonymousClass1FU r3, C84794Kw r4, int i) {
        String string = r3.getString(i);
        C18070vi.A0X(string);
        bundle.putString("positive_button", string);
        String string2 = r3.getString(2131898766);
        C18070vi.A0X(string2);
        bundle.putString("negative_button", string2);
        ? waDialogFragment = new WaDialogFragment();
        waDialogFragment.A1R(bundle);
        C17960vV.A07(r4);
        waDialogFragment.A01 = r4;
        r3.CMk(waDialogFragment, (String) null);
    }

    public static void A0m(View view, WDSBottomSheetDialogFragment wDSBottomSheetDialogFragment) {
        view.setBackground(C24261Jm.A00(wDSBottomSheetDialogFragment.A14(), 2131233694));
        int i = wDSBottomSheetDialogFragment.A2G().A00;
        if (i != -1) {
            C42491yG.A06(view, (float) i);
        }
    }

    public static void A0o(EditText editText) {
        editText.setText(editText.getEditableText().append(System.getProperty("line.separator")));
        editText.setSelection(editText.getEditableText().length());
    }

    public static void A0v(AnonymousClass10G r1, RoundedBottomSheetDialogFragment roundedBottomSheetDialogFragment) {
        roundedBottomSheetDialogFragment.A00 = AnonymousClass10G.A8i(r1);
        roundedBottomSheetDialogFragment.A00 = (C128116fT) r1.AAy.get();
    }

    public static void A0w(TextEmojiLabel textEmojiLabel, CharSequence charSequence) {
        textEmojiLabel.setText(C43251zV.A03(textEmojiLabel.getContext(), textEmojiLabel.getPaint(), textEmojiLabel.getEmojiLoader(), charSequence));
    }

    public static void A0x(WaImageView waImageView) {
        waImageView.A00 = (C18000vb) ((C27691Xc) ((AnonymousClass033) waImageView.generatedComponent())).A10.ABz.get();
    }

    public static void A0y(ConversationListView conversationListView, Object obj, AbstractCollection abstractCollection) {
        if (AnonymousClass1c4.A00((AnonymousClass1c4) conversationListView.getNewsletterConfig().get(), 2)) {
            abstractCollection.add(obj);
        }
    }

    public static void A12(AutoSizeTextView autoSizeTextView) {
        autoSizeTextView.A0I();
        autoSizeTextView.A00 = 0.0f;
        autoSizeTextView.A01 = 0.0f;
        autoSizeTextView.A02 = 0;
        autoSizeTextView.A03 = null;
    }

    public static void A16(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        C18070vi.A0d(obj, i);
        C18070vi.A0d(obj2, 8);
        C18070vi.A0d(obj3, 9);
        C18070vi.A0d(obj4, 10);
    }

    public static void A17(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        C18070vi.A0d(obj, i);
        C18070vi.A0d(obj2, 13);
        C18070vi.A0d(obj3, 14);
        C18070vi.A0d(obj4, 15);
    }

    public static void A18(Object obj, Object obj2, Object[] objArr, int i, int i2) {
        objArr[i] = new AnonymousClass1D6(obj, Integer.valueOf(i));
        objArr[i2] = new AnonymousClass1D6(obj2, Integer.valueOf(i2));
    }
}
