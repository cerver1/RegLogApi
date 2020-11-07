// Generated by view binder compiler. Do not edit!
package com.example.reglogapi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TableLayout;
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

public final class FragmentUsersInfoBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Guideline guideline4;

  @NonNull
  public final TableLayout table;

  @NonNull
  public final TextView useremail;

  @NonNull
  public final TextView useremaildisplay;

  @NonNull
  public final TextView userid;

  @NonNull
  public final TextView useriddisplay;

  @NonNull
  public final Button userinfologoutbtn;

  @NonNull
  public final ProgressBar userinfoprogressbar;

  @NonNull
  public final TextView username;

  @NonNull
  public final TextView usernamedisplay;

  private FragmentUsersInfoBinding(@NonNull ConstraintLayout rootView,
      @NonNull Guideline guideline4, @NonNull TableLayout table, @NonNull TextView useremail,
      @NonNull TextView useremaildisplay, @NonNull TextView userid, @NonNull TextView useriddisplay,
      @NonNull Button userinfologoutbtn, @NonNull ProgressBar userinfoprogressbar,
      @NonNull TextView username, @NonNull TextView usernamedisplay) {
    this.rootView = rootView;
    this.guideline4 = guideline4;
    this.table = table;
    this.useremail = useremail;
    this.useremaildisplay = useremaildisplay;
    this.userid = userid;
    this.useriddisplay = useriddisplay;
    this.userinfologoutbtn = userinfologoutbtn;
    this.userinfoprogressbar = userinfoprogressbar;
    this.username = username;
    this.usernamedisplay = usernamedisplay;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentUsersInfoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentUsersInfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_users_info, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentUsersInfoBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.guideline4;
      Guideline guideline4 = rootView.findViewById(id);
      if (guideline4 == null) {
        break missingId;
      }

      id = R.id.table;
      TableLayout table = rootView.findViewById(id);
      if (table == null) {
        break missingId;
      }

      id = R.id.useremail;
      TextView useremail = rootView.findViewById(id);
      if (useremail == null) {
        break missingId;
      }

      id = R.id.useremaildisplay;
      TextView useremaildisplay = rootView.findViewById(id);
      if (useremaildisplay == null) {
        break missingId;
      }

      id = R.id.userid;
      TextView userid = rootView.findViewById(id);
      if (userid == null) {
        break missingId;
      }

      id = R.id.useriddisplay;
      TextView useriddisplay = rootView.findViewById(id);
      if (useriddisplay == null) {
        break missingId;
      }

      id = R.id.userinfologoutbtn;
      Button userinfologoutbtn = rootView.findViewById(id);
      if (userinfologoutbtn == null) {
        break missingId;
      }

      id = R.id.userinfoprogressbar;
      ProgressBar userinfoprogressbar = rootView.findViewById(id);
      if (userinfoprogressbar == null) {
        break missingId;
      }

      id = R.id.username;
      TextView username = rootView.findViewById(id);
      if (username == null) {
        break missingId;
      }

      id = R.id.usernamedisplay;
      TextView usernamedisplay = rootView.findViewById(id);
      if (usernamedisplay == null) {
        break missingId;
      }

      return new FragmentUsersInfoBinding((ConstraintLayout) rootView, guideline4, table, useremail,
          useremaildisplay, userid, useriddisplay, userinfologoutbtn, userinfoprogressbar, username,
          usernamedisplay);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}