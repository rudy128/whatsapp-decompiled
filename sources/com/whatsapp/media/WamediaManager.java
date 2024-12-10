package com.whatsapp.media;

import X.AnonymousClass00H;
import X.AnonymousClass190;
import X.AnonymousClass1NM;
import X.AnonymousClass1S5;
import X.AnonymousClass1SO;
import X.AnonymousClass2H9;
import X.AnonymousClass2HR;
import X.AnonymousClass2RS;
import X.C1402370n;
import X.C17960vV;
import X.C18030ve;
import X.C26511Sk;
import X.C64062u9;
import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.GifHelper;
import com.whatsapp.Mp4Ops;
import com.whatsapp.NativeMediaHandler;
import com.whatsapp.stickers.WebpInfo;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.HashMap;

public class WamediaManager {
    public final C18030ve abProps;
    public final GifHelper gifHelper;
    public final Mp4Ops mp4Ops;
    public final AnonymousClass00H nativeMediaHandler;
    public final WebpUtils webpUtils;

    public void ensureWamediaManagerStarted() {
        ((NativeMediaHandler) this.nativeMediaHandler.get()).A00();
    }

    public WamediaManager(C18030ve r1, Mp4Ops mp4Ops2, GifHelper gifHelper2, WebpUtils webpUtils2, AnonymousClass00H r5) {
        this.abProps = r1;
        this.mp4Ops = mp4Ops2;
        this.gifHelper = gifHelper2;
        this.webpUtils = webpUtils2;
        this.nativeMediaHandler = r5;
    }

    public static String findHashExcludingMetadataFromInputStream(MessageDigest messageDigest, InputStream inputStream) {
        return WebpUtils.A02(messageDigest, inputStream);
    }

    public static String getFileHashExcludingMetadata(String str) {
        C17960vV.A01();
        File file = new File(str);
        if (file.exists()) {
            return WebpUtils.A01(file);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("WebpUtils/getFileHashExcludingMetadata/file does not exist, ");
        sb.append(str);
        Log.e(sb.toString());
        return null;
    }

    private GifHelper getGifHelper() {
        ensureWamediaManagerStarted();
        return this.gifHelper;
    }

    public static Integer getImpl() {
        return Mp4Ops.A00();
    }

    private Mp4Ops getMp4Ops() {
        ensureWamediaManagerStarted();
        return this.mp4Ops;
    }

    private WebpUtils getWebpUtils() {
        ensureWamediaManagerStarted();
        return this.webpUtils;
    }

    public void applyGifTag(File file) {
        ensureWamediaManagerStarted();
        this.gifHelper.A00(file);
    }

    public Mp4Ops.LibMp4OperationResult check(File file, boolean z) {
        Mp4Ops.LibMp4OperationResult mp4check;
        ensureWamediaManagerStarted();
        Mp4Ops mp4Ops2 = this.mp4Ops;
        Log.i("mp4ops/check/start");
        AnonymousClass1S5 r7 = mp4Ops2.A01;
        AnonymousClass2HR A00 = AnonymousClass1S5.A00(r7, file, 0, z);
        int i = 0;
        do {
            try {
                mp4check = Mp4Ops.mp4check(file.getAbsolutePath(), z);
                if (mp4check.success || !mp4check.ioException) {
                    C17960vV.A07(mp4check);
                    r7.A03(mp4check, A00, (File) null);
                } else {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException unused) {
                    }
                    i++;
                }
            } catch (Error e) {
                Log.e("mp4ops/integration fail/", e);
                StringBuilder sb = new StringBuilder();
                sb.append("integrity check error: ");
                sb.append(e.getMessage());
                throw new AnonymousClass2RS(0, sb.toString());
            }
        } while (i < 5);
        C17960vV.A07(mp4check);
        r7.A03(mp4check, A00, (File) null);
        if (A00 != null) {
            r7.A01.CC7(A00);
        }
        if (mp4check.success) {
            Log.i("mp4ops/check/finished");
            return mp4check;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("mp4ops/check/error_message/");
        sb2.append(mp4check.errorMessage);
        Log.e(sb2.toString());
        int i2 = mp4check.errorCode;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("integrity check failed, error_code: ");
        sb3.append(i2);
        sb3.append(" | message:");
        sb3.append(mp4check.errorMessage);
        throw new AnonymousClass2RS(i2, sb3.toString());
    }

    public boolean checkAndRepair(File file) {
        ensureWamediaManagerStarted();
        Mp4Ops mp4Ops2 = this.mp4Ops;
        Log.i("mp4ops/checkAndRepair/start");
        AnonymousClass1S5 r7 = mp4Ops2.A01;
        AnonymousClass2HR A00 = AnonymousClass1S5.A00(r7, file, 3, false);
        AnonymousClass1NM r6 = mp4Ops2.A02;
        File A01 = r6.A01(file);
        StringBuilder sb = new StringBuilder();
        sb.append("mp4ops/checkAndRepair/repairFileName.exists? ");
        sb.append(A01.exists());
        Log.i(sb.toString());
        try {
            Mp4Ops.LibMp4CheckAndRepairResult mp4checkAndRepair = Mp4Ops.mp4checkAndRepair(file.getAbsolutePath(), A01.getAbsolutePath());
            if (A00 != null) {
                Long l = A00.A0E;
                if (l != null) {
                    A00.A0E = Long.valueOf(System.nanoTime() - l.longValue());
                }
                A00.A0D = Long.valueOf((long) mp4checkAndRepair.errorCode);
                A00.A0C = Long.valueOf(A01.length());
                Mp4Ops.AudioStreamInfo audioStreamInfo = mp4checkAndRepair.asi;
                if (audioStreamInfo != null) {
                    A00.A06 = Long.valueOf((long) audioStreamInfo.averageBitrateKbps);
                    A00.A07 = Long.valueOf((long) audioStreamInfo.numChannels);
                    A00.A08 = Long.valueOf((long) audioStreamInfo.samplingRate);
                    A00.A00 = Integer.valueOf(audioStreamInfo.subType);
                    A00.A09 = 1L;
                    A00.A01 = Integer.valueOf(audioStreamInfo.type);
                }
                Mp4Ops.VideoStreamInfo videoStreamInfo = mp4checkAndRepair.vsi;
                if (videoStreamInfo != null) {
                    A00.A0F = Long.valueOf((long) videoStreamInfo.averageBitrateKbps);
                    A00.A0G = Long.valueOf((long) videoStreamInfo.framesPerKseconds);
                    A00.A0H = Long.valueOf((long) videoStreamInfo.height);
                    A00.A0I = Long.valueOf((long) videoStreamInfo.levelIdc);
                    A00.A0J = Long.valueOf((long) videoStreamInfo.profileIdc);
                    A00.A0K = Long.valueOf((long) videoStreamInfo.rotationDegrees);
                    A00.A0L = 2L;
                    A00.A05 = Integer.valueOf(videoStreamInfo.type);
                    A00.A0M = Long.valueOf((long) videoStreamInfo.width);
                }
                r7.A01.CC7(A00);
            }
            if (!mp4checkAndRepair.success) {
                if (mp4checkAndRepair.repaired && !A01.delete() && A01.exists()) {
                    Log.e("mp4ops/checkAndRepair/error_message failed to delete temp file");
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("mp4ops/checkAndRepair/error_message/");
                sb2.append(mp4checkAndRepair.errorMessage);
                Log.e(sb2.toString());
                if (mp4checkAndRepair.ioException) {
                    throw new IOException("No space");
                }
                int i = mp4checkAndRepair.errorCode;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("integrity check/repair failed, error_code: ");
                sb3.append(i);
                sb3.append(" | message: ");
                sb3.append(mp4checkAndRepair.errorMessage);
                throw new AnonymousClass2RS(i, sb3.toString());
            }
            Log.i("mp4ops/checkAndRepair/finished");
            if (mp4checkAndRepair.repaired) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("mp4ops/checkAndRepair/file_is_repaired, new file created and renamed: ");
                sb4.append(A01.getAbsolutePath());
                Log.i(sb4.toString());
                mp4Ops2.A01(A01, file);
                if (A01.delete() || !A01.exists()) {
                    return true;
                }
                Log.e("mp4ops/checkAndRepair/file_is_repaired failed to delete temp file");
                return true;
            }
            Log.i("mp4ops/checkAndRepair/file_repair_not_needed but will remove exif data");
            if (!A01.delete() && A01.exists()) {
                Log.e("mp4ops/checkAndRepair/file_repair_not_needed failed to delete temp file");
            }
            File A012 = r6.A01(file);
            mp4Ops2.A01(file, A012);
            if (A012.renameTo(file)) {
                return true;
            }
            Log.i("mp4ops/checkAndRepair/rename_failed");
            throw new IOException("unable to rename file");
        } catch (Error e) {
            Log.e("mp4ops/integration fail/", e);
            if (e.getCause() instanceof FileNotFoundException) {
                throw e;
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append("integrity check error: ");
            sb5.append(e.getMessage());
            throw new AnonymousClass2RS(0, sb5.toString());
        }
    }

    public boolean createThumbnail(byte[] bArr, int i, String str) {
        AnonymousClass2H9 r4;
        ensureWamediaManagerStarted();
        AnonymousClass1S5 r5 = this.webpUtils.A02;
        long j = (long) i;
        if (!AnonymousClass1S5.A01(r5, 7)) {
            r4 = null;
        } else {
            r4 = new AnonymousClass2H9();
            File file = new File(str);
            r4.A03 = 0L;
            r4.A04 = 0L;
            r4.A05 = Long.valueOf(file.length());
            r4.A06 = Long.valueOf(file.length() + j);
            r4.A00 = 1;
            r4.A07 = 0L;
            r4.A08 = 0L;
            r4.A09 = 0L;
            r4.A0A = 0L;
            r4.A0B = 0L;
            r4.A0C = Long.valueOf(System.nanoTime());
            r4.A02 = 7;
            r4.A01 = Mp4Ops.A00();
        }
        int createFirstThumbnail = WebpUtils.createFirstThumbnail(bArr, i, str);
        if (r4 != null) {
            r4.A0B = Long.valueOf((long) createFirstThumbnail);
        }
        r5.A04(r4);
        if (createFirstThumbnail != 0) {
            return false;
        }
        return true;
    }

    public byte[] extractWebpMetadataBytes(String str) {
        AnonymousClass2H9 r4;
        ensureWamediaManagerStarted();
        AnonymousClass1S5 r5 = this.webpUtils.A02;
        if (!AnonymousClass1S5.A01(r5, 4)) {
            r4 = null;
        } else {
            r4 = new AnonymousClass2H9();
            File file = new File(str);
            r4.A03 = 0L;
            r4.A04 = 0L;
            r4.A05 = Long.valueOf(file.length());
            r4.A06 = 0L;
            r4.A00 = 1;
            r4.A07 = 0L;
            r4.A08 = 0L;
            r4.A09 = 0L;
            r4.A0A = 0L;
            r4.A0B = 0L;
            r4.A0C = Long.valueOf(System.nanoTime());
            r4.A02 = 4;
            r4.A01 = Mp4Ops.A00();
        }
        WebpUtils.ExifMetadata fetchWebpMetadata = WebpUtils.fetchWebpMetadata(str);
        if (fetchWebpMetadata != null) {
            int i = fetchWebpMetadata.returnCode;
            long j = (long) fetchWebpMetadata.length;
            if (r4 != null) {
                r4.A0B = Long.valueOf((long) i);
                r4.A06 = Long.valueOf(j);
            }
        }
        r5.A04(r4);
        if (fetchWebpMetadata == null || fetchWebpMetadata.returnCode != 0) {
            return null;
        }
        return fetchWebpMetadata.metadata;
    }

    public int getFirstFrameLocation(String str) {
        AnonymousClass2H9 r4;
        ensureWamediaManagerStarted();
        AnonymousClass1S5 r5 = this.webpUtils.A02;
        if (!AnonymousClass1S5.A01(r5, 6)) {
            r4 = null;
        } else {
            r4 = new AnonymousClass2H9();
            File file = new File(str);
            r4.A03 = 0L;
            r4.A04 = 0L;
            r4.A05 = Long.valueOf(file.length());
            r4.A06 = 0L;
            r4.A00 = 1;
            r4.A07 = 0L;
            r4.A08 = 0L;
            r4.A09 = 0L;
            r4.A0A = 0L;
            r4.A0B = 0L;
            r4.A0C = Long.valueOf(System.nanoTime());
            r4.A02 = 6;
            r4.A01 = Mp4Ops.A00();
        }
        int firstWebpThumbnailMinimumFileLength = WebpUtils.getFirstWebpThumbnailMinimumFileLength(str);
        if (r4 != null) {
            r4.A0B = Long.valueOf((long) firstWebpThumbnailMinimumFileLength);
        }
        r5.A04(r4);
        if (firstWebpThumbnailMinimumFileLength < 0) {
            return -1;
        }
        return firstWebpThumbnailMinimumFileLength;
    }

    public boolean hasGifTag(File file) {
        ensureWamediaManagerStarted();
        return this.gifHelper.A01(file);
    }

    public File insertAndCopyMetadata(File file, byte[] bArr) {
        ensureWamediaManagerStarted();
        File A00 = WebpUtils.A00(this.webpUtils, file, bArr);
        try {
            if (!(file.getParentFile() == null || A00 == null)) {
                String absolutePath = file.getParentFile().getAbsolutePath();
                StringBuilder sb = new StringBuilder();
                sb.append(absolutePath);
                sb.append("/");
                sb.append(C1402370n.A00(A00).replace('/', '-'));
                sb.append(".webp");
                File file2 = new File(sb.toString());
                A00.renameTo(file2);
                A00.getAbsolutePath();
                file.getAbsolutePath();
                return file2;
            }
        } catch (IOException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("WebpUtils/insertWebpMetadata/error hashing, input file:");
            sb2.append(file);
            Log.e(sb2.toString(), e);
        }
        return null;
    }

    public boolean insertWebpMetadata(File file, byte[] bArr) {
        ensureWamediaManagerStarted();
        File A00 = WebpUtils.A00(this.webpUtils, file, bArr);
        if (A00 == null) {
            return false;
        }
        try {
            boolean renameTo = A00.renameTo(file);
            A00.getAbsolutePath();
            file.getAbsolutePath();
            return renameTo;
        } finally {
            C64062u9.A0Q(A00);
        }
    }

    public void removeAudioTracks(File file) {
        AnonymousClass2RS r0;
        ensureWamediaManagerStarted();
        Mp4Ops mp4Ops2 = this.mp4Ops;
        try {
            if (AnonymousClass1SO.A04(file).A00 != 0) {
                AnonymousClass1NM r7 = mp4Ops2.A02;
                File A01 = r7.A01(file);
                AnonymousClass1S5 r5 = mp4Ops2.A01;
                AnonymousClass2HR A02 = r5.A02(file, A01);
                Mp4Ops.LibMp4OperationResult removeAudioTracks = Mp4Ops.removeAudioTracks(file.getAbsolutePath(), A01.getAbsolutePath());
                r5.A03(removeAudioTracks, A02, A01);
                if (A02 != null) {
                    r5.A01.CC7(A02);
                }
                if (!removeAudioTracks.success) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("mp4ops/remove-audio-tracks");
                    sb.append(removeAudioTracks.errorMessage);
                    Log.e(sb.toString());
                    if (!A01.delete() && A01.exists()) {
                        Log.e("mp4ops/remove-audio-tracks failed to delete temp file");
                    }
                    int i = removeAudioTracks.errorCode;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("invalid result, error_code: ");
                    sb2.append(i);
                    sb2.append(" | message: ");
                    sb2.append(removeAudioTracks.errorMessage);
                    r0 = new AnonymousClass2RS(i, sb2.toString());
                } else if (!C26511Sk.A0S(r7, A01, file)) {
                    Log.e("mp4ops/remove-audio-tracks failed to apply tag properly.  Renaming marked file to original filepath unsuccessful");
                    r0 = new AnonymousClass2RS(0, "mp4ops/remove-audio-tracks failed to apply tag properly.  Renaming marked file to original filepath unsuccessful");
                } else {
                    return;
                }
                throw r0;
            }
        } catch (IOException e) {
            Log.e("Could not access file or failed to move files properly", e);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Could not access file or failed to move files properly: ");
            sb3.append(e.getMessage());
            throw new AnonymousClass2RS(0, sb3.toString());
        }
    }

    public void removeDolbyEAC3Track(File file, File file2) {
        ensureWamediaManagerStarted();
        Mp4Ops mp4Ops2 = this.mp4Ops;
        Log.i("mp4ops/removeDolbyEAC3Track/start");
        AnonymousClass1S5 r4 = mp4Ops2.A01;
        AnonymousClass2HR A02 = r4.A02(file, file2);
        try {
            Mp4Ops.LibMp4OperationResult mp4removeDolbyEAC3Track = Mp4Ops.mp4removeDolbyEAC3Track(file.getAbsolutePath(), file2.getAbsolutePath());
            r4.A03(mp4removeDolbyEAC3Track, A02, file2);
            if (A02 != null) {
                r4.A01.CC7(A02);
            }
            if (!mp4removeDolbyEAC3Track.success) {
                StringBuilder sb = new StringBuilder();
                sb.append("mp4ops/check/error_message/");
                sb.append(mp4removeDolbyEAC3Track.errorMessage);
                Log.e(sb.toString());
                if (mp4removeDolbyEAC3Track.ioException) {
                    throw new IOException("No space");
                }
                int i = mp4removeDolbyEAC3Track.errorCode;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("removeDolbyEAC3Track failed, error_code: ");
                sb2.append(i);
                sb2.append(" | message: ");
                sb2.append(mp4removeDolbyEAC3Track.errorMessage);
                throw new AnonymousClass2RS(i, sb2.toString());
            }
            Log.i("mp4ops/removeDolbyEAC3Track/finished");
        } catch (Error e) {
            Log.e("mp4ops/removeDolbyEAC3Track/", e);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("integrity check error: ");
            sb3.append(e.getMessage());
            throw new AnonymousClass2RS(0, sb3.toString());
        }
    }

    public void removeExifData(File file, File file2) {
        ensureWamediaManagerStarted();
        this.mp4Ops.A01(file, file2);
    }

    public Mp4Ops.LibMp4StreamCheckResult streamCheck(File file, boolean z, long j) {
        Mp4Ops.LibMp4StreamCheckResult mp4streamcheck;
        ensureWamediaManagerStarted();
        Mp4Ops mp4Ops2 = this.mp4Ops;
        Log.i("mp4ops/streamcheck/start");
        AnonymousClass1S5 r4 = mp4Ops2.A01;
        AnonymousClass2HR A00 = AnonymousClass1S5.A00(r4, file, 1, false);
        int i = 0;
        do {
            try {
                mp4streamcheck = Mp4Ops.mp4streamcheck(file.getAbsolutePath(), z, j);
                if (mp4streamcheck.success || !mp4streamcheck.ioException) {
                    C17960vV.A07(mp4streamcheck);
                } else {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException unused) {
                    }
                    i++;
                }
            } catch (Error e) {
                Log.e("mp4ops/integration fail/", e);
                StringBuilder sb = new StringBuilder();
                sb.append("stream integrity check error: ");
                sb.append(e.getMessage());
                throw new AnonymousClass2RS(0, sb.toString());
            }
        } while (i < 5);
        C17960vV.A07(mp4streamcheck);
        if (mp4streamcheck.success) {
            Log.i("mp4ops/streamcheck/finished");
            long length = file.length();
            if (A00 != null) {
                Long l = A00.A0E;
                if (l != null) {
                    A00.A0E = Long.valueOf(System.nanoTime() - l.longValue());
                }
                A00.A0D = Long.valueOf((long) mp4streamcheck.errorCode);
                A00.A0B = Long.valueOf(length);
                A00.A0C = Long.valueOf(mp4streamcheck.bytesRequiredToExtractThumbnail);
                r4.A01.CC7(A00);
            }
            return mp4streamcheck;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("mp4ops/streamcheck/error_message/");
        sb2.append(mp4streamcheck.errorMessage);
        Log.e(sb2.toString());
        int i2 = mp4streamcheck.errorCode;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("integrity check failed, error_code: ");
        sb3.append(i2);
        sb3.append(" | message: ");
        sb3.append(mp4streamcheck.errorMessage);
        throw new AnonymousClass2RS(i2, sb3.toString());
    }

    public void uploadMp4FailureLogs(File file, Exception exc, String str, boolean z) {
        boolean z2;
        ensureWamediaManagerStarted();
        Mp4Ops mp4Ops2 = this.mp4Ops;
        if (!z) {
            Log.i("Mp4Ops/uploadMp4FailureLogs disabled for non-debug builds");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(file.getParent());
        sb.append("/video.fos");
        File file2 = new File(sb.toString());
        try {
            file2.createNewFile();
            AnonymousClass1S5 r7 = mp4Ops2.A01;
            AnonymousClass2HR A00 = AnonymousClass1S5.A00(r7, file, 6, false);
            try {
                z2 = Mp4Ops.mp4forensic(400, file2.getAbsolutePath(), file.getAbsolutePath());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("mp4ops/forensic ret=");
                sb2.append(z2);
                Log.e(sb2.toString());
            } catch (Error e) {
                Log.e("videotranscodder/forensic fail/", e);
                z2 = false;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("mp4ops/forensic-upload/create result=");
            sb3.append(z2);
            Log.i(sb3.toString());
            if (A00 != null) {
                Long l = A00.A0E;
                if (l != null) {
                    A00.A0E = Long.valueOf(System.nanoTime() - l.longValue());
                }
                long j = 0;
                if (!z2) {
                    j = 570;
                }
                A00.A0D = Long.valueOf(j);
                A00.A0C = Long.valueOf(file2.length());
                r7.A01.CC7(A00);
            }
            if (z2) {
                try {
                    Context context = mp4Ops2.A03.A00;
                    String name = file2.getName();
                    if (TextUtils.isEmpty(name)) {
                        name = "source";
                    }
                    File A05 = C64062u9.A05(file2, context.getFilesDir(), name);
                    Log.e("Mp4Ops/uploadMp4FailureLogs", exc);
                    HashMap hashMap = new HashMap();
                    if (A05 != null) {
                        hashMap.put("attachment", A05.getPath());
                    }
                    AnonymousClass190 r2 = mp4Ops2.A00;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("LibMp4Operations ");
                    sb4.append(str);
                    sb4.append(" failed (file): ");
                    sb4.append(exc.getMessage());
                    r2.A0F("Mp4Ops/uploadMp4FailureLogs", sb4.toString(), hashMap, true);
                } catch (IOException e2) {
                    Log.e("mp4ops/forensic-upload/", e2);
                }
            }
            file2.delete();
        } catch (IOException e3) {
            Log.e("Mp4Ops/uploadMp4FailureLogs Failed to create forensic file", e3);
        }
    }

    public WebpInfo verifyWebpFile(String str) {
        AnonymousClass2H9 r2;
        ensureWamediaManagerStarted();
        WebpUtils webpUtils2 = this.webpUtils;
        WebpUtils.WebpInfoResult verifyWebpFileIntegrity = WebpUtils.verifyWebpFileIntegrity(str);
        AnonymousClass1S5 r3 = webpUtils2.A02;
        if (!AnonymousClass1S5.A01(r3, 0)) {
            r2 = null;
        } else {
            r2 = new AnonymousClass2H9();
            File file = new File(str);
            r2.A03 = 0L;
            r2.A04 = 0L;
            r2.A05 = Long.valueOf(file.length());
            r2.A06 = 0L;
            r2.A00 = 1;
            r2.A07 = 0L;
            r2.A08 = 0L;
            r2.A09 = 0L;
            r2.A0A = 0L;
            r2.A0B = 0L;
            r2.A0C = Long.valueOf(System.nanoTime());
            r2.A02 = 0;
            r2.A01 = Mp4Ops.A00();
            r2.A0B = Long.valueOf((long) verifyWebpFileIntegrity.returnCode);
            WebpInfo webpInfo = verifyWebpFileIntegrity.webpInfo;
            if (webpInfo != null) {
                r2.A09 = Long.valueOf((long) webpInfo.width);
                r2.A08 = Long.valueOf((long) webpInfo.height);
                r2.A07 = Long.valueOf((long) webpInfo.minFrameDurationMS);
                r2.A0A = Long.valueOf((long) webpInfo.numFrames);
            }
        }
        r3.A04(r2);
        if (verifyWebpFileIntegrity.returnCode != 0) {
            return null;
        }
        return verifyWebpFileIntegrity.webpInfo;
    }

    public static String getFileHashExcludingMetadata(File file) {
        return WebpUtils.A01(file);
    }
}
