// Generated by view binder compiler. Do not edit!
package com.example.reglogapi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import com.example.reglogapi.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSignupBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText confirmPassword;

  @NonNull
  public final Guideline guideline2;

  @NonNull
  public final TextView logintxtbtn;

  @NonNull
  public final Button signupbtn;

  @NonNull
  public final EditText signupemail;

  @NonNull
  public final EditText signupname;

  @NonNull
  public final EditText signuppassword;

  @NonNull
  public final ProgressBar signupprogressbar;

  @NonNull
  public final TextView textView3;

  private FragmentSignupBinding(@NonNull ConstraintLayout rootView,
      @NonNull EditText confirmPassword, @NonNull Guideline guideline2,
      @NonNull TextView logintxtbtn, @NonNull Button signupbtn, @NonNull EditText signupemail,
      @NonNull EditText signupname, @NonNull EditText signuppassword,
      @NonNull ProgressBar signupprogressbar, @NonNull TextView textView3) {
    this.rootView = rootView;
    this.confirmPassword = confirmPassword;
    this.guideline2 = guideline2;
    this.logintxtbtn = logintxtbtn;
    this.signupbtn = signupbtn;
    this.signupemail = signupemail;
    this.signupname = signupname;
    this.signuppassword = signuppassword;
    this.signupprogressbar = signupprogressbar;
    this.textView3 = textView3;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSignupBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSignupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_signup, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSignupBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.confirm_password;
      EditText confirmPassword = rootView.findViewById(id);
      if (confirmPassword == null) {
        break missingId;
      }

      id = R.id.guideline2;
      Guideline guideline2 = rootView.findViewById(id);
      if (guideline2 == null) {
        break missingId;
      }

      id = R.id.logintxtbtn;
      TextView logintxtbtn = rootView.findViewById(id);
      if (logintxtbtn == null) {
        break missingId;
      }

      id = R.id.signupbtn;
      Button signupbtn = rootView.findViewById(id);
      if (signupbtn == null) {
        break missingId;
      }

      id = R.id.signupemail;
      EditText signupemail = rootView.findViewById(id);
      if (signupemail == null) {
        break missingId;
      }

      id = R.id.signupname;
      EditText signupname = rootView.findViewById(id);
      if (signupname == null) {
        break missingId;
      }

      id = R.id.signuppassword;
      EditText signuppassword = rootView.findViewById(id);
      if (signuppassword == null) {
        break missingId;
      }

      id = R.id.signupprogressbar;
      ProgressBar signupprogressbar = rootView.findViewById(id);
      if (signupprogressbar == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = rootView.findViewById(id);
      if (textView3 == null) {
        break missingId;
      }

      return new FragmentSignupBinding((ConstraintLayout) rootView, confirmPassword, guideline2,
          logintxtbtn, signupbtn, signupemail, signupname, signuppassword, signupprogressbar,
          textView3);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}