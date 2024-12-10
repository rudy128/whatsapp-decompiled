package com.whatsapp;

import X.AnonymousClass118;
import X.AnonymousClass190;
import X.AnonymousClass1NM;
import X.AnonymousClass1S5;
import X.AnonymousClass2HR;
import X.AnonymousClass2RS;
import X.C17970vW;
import X.C18020vd;
import X.C18040vf;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

public class Mp4Ops {
    public final AnonymousClass190 A00;
    public final AnonymousClass1S5 A01;
    public final AnonymousClass1NM A02;
    public final AnonymousClass118 A03;

    public static native int getMp4opsImpl();

    public static native LibMp4OperationResult mp4check(String str, boolean z);

    public static native LibMp4CheckAndRepairResult mp4checkAndRepair(String str, String str2);

    public static native boolean mp4forensic(int i, String str, String str2);

    public static native LibMp4OperationResult mp4mux(String str, String str2, String str3, float f, int i);

    public static native LibMp4OperationResult mp4removeDolbyEAC3Track(String str, String str2);

    public static native LibMp4StreamCheckResult mp4streamcheck(String str, boolean z, long j);

    public static native LibMp4OperationResult removeAudioTracks(String str, String str2);

    public class AudioStreamInfo {
        public final int averageBitrateKbps;
        public final long durationMs;
        public final int mpegAudioObjectType;
        public final int mpegAudioToolsPresent;
        public final int numChannels;
        public final int samplingRate;
        public final int subType;
        public final int trackId;
        public final int type;

        public AudioStreamInfo(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j) {
            this.trackId = i;
            this.type = i2;
            this.subType = i3;
            this.mpegAudioObjectType = i4;
            this.mpegAudioToolsPresent = i5;
            this.numChannels = i6;
            this.samplingRate = i7;
            this.averageBitrateKbps = i8;
            this.durationMs = j;
        }
    }

    public class LibMp4CheckAndRepairResult {
        public final AudioStreamInfo asi;
        public final int errorCode;
        public final String errorMessage;
        public final boolean ioException;
        public final long newMajorVersion;
        public final long newMinorVersion;
        public final int newOriginator;
        public final long newReleaseVersion;
        public final long oldMajorVersion;
        public final long oldMinorVersion;
        public final int oldOriginator;
        public final long oldReleaseVersion;
        public final boolean repairRequired;
        public final boolean repaired;
        public final boolean success;
        public final VideoStreamInfo vsi;

        public LibMp4CheckAndRepairResult(boolean z, boolean z2, boolean z3, int i, String str, boolean z4, AudioStreamInfo audioStreamInfo, VideoStreamInfo videoStreamInfo, long j, long j2, long j3, int i2, long j4, long j5, long j6, int i3) {
            this.success = z;
            this.repaired = z2;
            this.repairRequired = z3;
            this.errorCode = i;
            this.errorMessage = str;
            this.ioException = z4;
            this.asi = audioStreamInfo;
            this.vsi = videoStreamInfo;
            this.oldMajorVersion = j;
            this.oldMinorVersion = j2;
            this.oldReleaseVersion = j3;
            this.oldOriginator = i2;
            this.newMajorVersion = j4;
            this.newMinorVersion = j5;
            this.newReleaseVersion = j6;
            this.newOriginator = i3;
        }
    }

    public class LibMp4OperationResult {
        public final AudioStreamInfo asi;
        public final int errorCode;
        public final String errorMessage;
        public final boolean ioException;
        public final boolean success;
        public final VideoStreamInfo vsi;

        public LibMp4OperationResult(boolean z, boolean z2, int i, AudioStreamInfo audioStreamInfo, VideoStreamInfo videoStreamInfo, String str) {
            this.success = z;
            this.ioException = z2;
            this.errorCode = i;
            this.asi = audioStreamInfo;
            this.vsi = videoStreamInfo;
            this.errorMessage = str;
        }
    }

    public class LibMp4StreamCheckResult {
        public final long bytesRequiredToExtractThumbnail;
        public final int errorCode;
        public final String errorMessage;
        public final boolean ioException;
        public final boolean success;

        public LibMp4StreamCheckResult(boolean z, boolean z2, int i, String str, long j) {
            this.success = z;
            this.ioException = z2;
            this.errorCode = i;
            this.errorMessage = str;
            this.bytesRequiredToExtractThumbnail = j;
        }
    }

    public class VideoStreamInfo {
        public final int averageBitrateKbps;
        public final long durationMs;
        public final int framesPerKseconds;
        public final int height;
        public final int levelIdc;
        public final int profileIdc;
        public final int rotationDegrees;
        public final int trackId;
        public final int type;
        public final int width;

        public VideoStreamInfo(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, long j) {
            this.trackId = i;
            this.type = i2;
            this.profileIdc = i3;
            this.levelIdc = i4;
            this.rotationDegrees = i5;
            this.width = i6;
            this.height = i7;
            this.framesPerKseconds = i8;
            this.averageBitrateKbps = i9;
            this.durationMs = j;
        }
    }

    public static Integer A00() {
        Boolean bool = C17970vW.A03;
        return Integer.valueOf(getMp4opsImpl());
    }

    public void A01(File file, File file2) {
        AnonymousClass2HR r6;
        Throwable r1;
        AnonymousClass1S5 r7 = this.A01;
        int i = 1 << 5;
        if ((C18020vd.A00(C18040vf.A02, r7.A00, 5561) & i) == i) {
            r6 = new AnonymousClass2HR();
            r6.A0B = 0L;
            if (file != null) {
                long length = 0 + file.length();
                r6.A0B = Long.valueOf(length);
                r6.A0B = Long.valueOf(length + file.length());
            }
            r6.A02 = 0;
            r6.A03 = A00();
            r6.A04 = 5;
            r6.A0E = Long.valueOf(System.nanoTime());
        } else {
            r6 = null;
        }
        try {
            Log.i("mp4ops/removeExifData/start");
            LibMp4OperationResult mp4mux = mp4mux(file.getAbsolutePath(), file.getAbsolutePath(), file2.getAbsolutePath(), -1.0f, -1);
            StringBuilder sb = new StringBuilder();
            sb.append("mp4ops/removeExifData/finished success=");
            sb.append(mp4mux.success);
            Log.i(sb.toString());
            r7.A03(mp4mux, r6, file2);
            if (r6 != null) {
                r7.A01.CC7(r6);
            }
            if (!mp4mux.success) {
                if (mp4mux.ioException) {
                    r1 = new IOException("mp4ops/removeExifData/No space");
                } else {
                    int i2 = mp4mux.errorCode;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("mp4ops/removeExifData failed, error_code: ");
                    sb2.append(i2);
                    sb2.append(" | message: ");
                    sb2.append(mp4mux.errorMessage);
                    r1 = new AnonymousClass2RS(i2, sb2.toString());
                }
                throw r1;
            }
        } catch (Error e) {
            Log.e("mp4ops/removeExifData/failed: mp4mux error, exiting", e);
            throw new AnonymousClass2RS(0, e.getMessage());
        }
    }

    public Mp4Ops(AnonymousClass190 r1, AnonymousClass1S5 r2, AnonymousClass1NM r3, AnonymousClass118 r4) {
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
