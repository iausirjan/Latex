%%
%%  This is file `IUST-Thesis.cls',
%%  I changed it for Islamic Azad University Of  Sirjan 
%% Saeb Molaee saeb@riseup.net http://sae13.ir
%%  It is a modification  of Tabriz_thesis of Vahid Damanafshan,
%%	by: Mahmood Amintoosi, m.amintoosi@gmail.com
%%  http://profsite.sttu.ac.ir/mamintoosi
%%	Ver 0.1, Jan 2012

%% Original Copyright

%%  The original file was xepersian-thesis.cls by Vafa Khalighi
%%   __________________________________
%%   Copyright © 2011-2012 Vahid Damanafshan
%%  
%%   http://damanafshan.tk      
%%   http://forum.parsilatex.com
%% 
%% 
\NeedsTeXFormat{LaTeX2e}
\ProvidesClass{VThesis}
              [10/21/2011 v0.4
 Persian thesis document class in XeLaTeX for University of Tabriz projects/theses/dissertations]
\DeclareOption*{\PassOptionsToClass{\CurrentOption}{book}}
\ProcessOptions
\LoadClass[a4paper,12pt]{book}
\def\university#1{\gdef\@university{#1}}
\def\department#1{\gdef\@department{#1}}
\def\degree#1{\gdef\@degree{#1}}
\def\thesisdate#1{\gdef\@thesisdate{#1}}
\def\defencedate#1{\gdef\@defencedate{#1}}
\newcommand{\firstsupervisor}[1]{\def\@firstsupervisor{#1}}
\newcommand{\secondsupervisor}[1]{\def\@secondsupervisor{#1}}
\newcommand{\firstadvisor}[1]{\def\@firstadvisor{#1}}
\newcommand{\secondadvisor}[1]{\def\@secondadvisor{#1}}
\def\name#1{\gdef\@name{#1}}
\def\surname#1{\gdef\@surname{#1}}
\def\keywords#1{\gdef\@keywords{#1}}
\def\fa-abstract#1{\gdef\@fa-abstract{#1}}
\def\faculty#1{\gdef\@faculty{#1}}
\def\subject#1{\gdef\@subject{#1}}
\def\field#1{\gdef\@field{#1}}
\def\department#1{\gdef\@department{#1}}
\def\projectLabel#1{\gdef\@projectLabel{#1}}
\def\studentID#1{\gdef\@studentID{#1}}
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
\def\latintitle#1{\gdef\@latintitle{#1}}
\def\latinauthor#1{\gdef\@latinauthor{#1}}
\def\latindegree#1{\gdef\@latindegree{#1}}
\def\latinfaculty#1{\gdef\@latinfaculty{#1}}
\def\latinthesisdate#1{\gdef\@latinthesisdate{#1}}
\def\latinsubject#1{\gdef\@latinsubject{#1}}
\def\latinfield#1{\gdef\@latinfield{#1}}
\def\firstlatinsupervisor#1{\gdef\@firstlatinsupervisor{#1}}
\def\secondlatinsupervisor#1{\gdef\@secondlatinsupervisor{#1}}
\def\firstlatinadvisor#1{\gdef\@firstlatinadvisor{#1}}
\def\secondlatinadvisor#1{\gdef\@secondlatinadvisor{#1}}
\def\latinname#1{\gdef\@latinname{#1}}
\def\latinsurname#1{\gdef\@latinsurname{#1}}
\def\en-abstract#1{\gdef\@en-abstract{#1}}
\def\latinkeywords#1{\gdef\@latinkeywords{#1}}
\def\latinuniversity#1{\gdef\@latinuniversity{#1}}
\def\latinbranch#1{\gdef\@latinbranch{#1}}
\def\latinthesistype#1{\gdef\@latinthesistype{#1}}
%%%%%%%%%%%%%%%%%%%%%%%%%%%
\newif\if@bscthesis
\@bscthesisfalse
\DeclareOption{bsc}{\@bscthesistrue}
\newif\if@mscthesis
\@mscthesisfalse
\DeclareOption{msc}{\@mscthesistrue}
\ProcessOptions

\ifx\@projectLabel\undefined%
{
\if@mscthesis
{\projectLabel{پایان‌نامه}}
\else
 \if@bscthesis
 {\projectLabel{پروژه }}
 \else
{\projectLabel{رساله}}
\fi\fi
}\fi

\ifx\@degree\undefined%
{
\if@mscthesis
\degree{کارشناسی ارشد M.Sc}
\else
\if@bscthesis
\degree{کارشناسی}
\else
\degree{دکتری}
\fi\fi
}
%%%%%%%%%%%%%%%%%%%%%%%%%%%
\newcommand{\firstPage}{\begin{titlepage}
%\topmargin=-30pt
\vspace{-10mm}
\centerline{{\includegraphics[width=5cm]{files/iau}}}

\par
%\vspace{-35mm}
\bfLarge{\@university}
\par
{\bfLarge{\@faculty \  \@department}}
\vskip 1.5cm

\if@bscthesis 
	{\Large\bfseries{پروژه کارشناسی \@subject}
	\ifx\@field\undefined%
		\relax
	\else
		گرایش \@field
	\fi
	}
\else
	{\Large\bfseries \@projectLabel\ \writtenfor
	\@degree{} \newline
	}
%	{\large\bfseries{در رشته \@subject}}
	\vskip .2cm
	\centerline{\Large \bfseries%
		گرایش \@field}
\fi	
	\vskip .2cm
{\LARGE\textbf\titlefont \@title}\par
\vskip 5mm
\vskip 1cm
\large
{
\ifx\@firstsupervisor\undefined%
	\ifx\@secondsupervisor\undefined%
	\else
	\fi
\else
\ifx\@secondsupervisor\undefined%
{\large\bfseries
استاد راهنما
}
{\Large\bfseries\par
\@firstsupervisor}
\else
\Large\
اساتید راهنما
\par
{\Large\bfseries \@firstsupervisor{} و \@secondsupervisor}
\fi\fi}
\par\large
{\ifx\@firstadvisor\undefined%
\ifx\@secondadvisor\undefined%
\else\fi
\else
\ifx\@secondadvisor\undefined%
استاد مشاور
{\Large\bfseries\par
\@firstadvisor}
\else

\large
استادان مشاور
\par
{\Large\bfseries\@firstadvisor{} و \@secondadvisor}
\fi\fi}

\par
\par
{\Large\bfseries{\large\bfseries
نگارش

   \@name\ \ \@surname}}
\par
\vskip 15mm

\vskip 6mm
%\vfill
{\large \@thesisdate}
%\vfill
\end{titlepage}%
} % end of firstPage

\newcommand{\besmPage}{
%% صفحه سفید
\newpage
\thispagestyle{empty}
\setcounter{page}{1}
%\pagestyle{empty}\noindent\\ 
%% بسم الله الرحمن الرحیم
\newpage
\thispagestyle{empty}
%\hfill
\begin{center}
\includegraphics[width=10cm]{files/besm}
\end{center}
}
\newcommand{\manshoor}{
%% صفحه سفید
\newpage
\thispagestyle{empty}
%\setcounter{page}{1}
%\pagestyle{empty}\noindent\\ 
%% بسم الله الرحمن الرحیم
\newpage
%\thispagestyle{empty}
%\hfill
\begin{center}
\includegraphics[width=1.0\textwidth]{files/manshoor}
\end{center}
}

%% تاییدیه هیات داوران
\newcommand{\davaranPage}{
\newpage
%%saeb%%\setcounter{page}{1}
%\thispagestyle{empty}

\begin{center}
{\Large \titlefont
 تأییدیه‌ی هیأت داوران جلسه‌ی دفاع از \@projectLabel
 }
\end{center}
\vspace{.5cm}

نام دانشكده: \@faculty

نام دانشجو: \@name{} \@surname

عنوان \@projectLabel: \@title

تاریخ دفاع: \@thesisdate

رشته: \@subject

%\vspace{.5cm}
گرایش: \@field
}

% تأییدیه‌ی صحت و اصالت نتایج
\newcommand{\esalatPage}{
\newpage
%\thispagestyle{empty}
\begin{center}
\centerline{\includegraphics{files/iaulogo}}
{\textbf{\titlefont\@university\\
حوزه معاونت، پژوهش و فناوری\\
تأییدیه‌ی صحت و اصالت نتایج \\
 }}
\vspace{.2cm}

\vspace{.2cm}
\end{center}
\doublespacing 
اینجانب
\@name \ \@surname \ 
 دانش آموخته مقطع 
 \@degree {}
 در رشته 
 \@subject {}
 که در 
                \ifx\@defencedate\undefined
                        \@thesisdate \  \ 
                \else
                تاریخ 
                        \@defencedate \ \ 
                  \fi
                از پایان نامه خود تحت عنوان   
             "\@title{}" \ 
با کسب نمره\hspace*{1cm}و درجه\hspace*{3cm}
                  دفاع نموده‎ ام بدینوسیله متعهد می شوم:
                  \begin{enumerate}
                  \item
     این پایان نامه حاصل تحقیق و پژوهش انجام شده توسط اینجانب بوده و در مواردی  که از دستاوردهای علمی وپژوهشی دیگران(اعم از پایان نامه،کتاب،مقاله و ......)استفاده نموده‎ام،مطابق ضوابط ورویه موجود،نام منبع مورد استفاده وسایر مشخصات آن را درفهرست مربوطه ذکر و درج کرده ام.
     \item
 این پایان نامه قبلا برای دریافت هیچ مدرک تحصیلی(هم سطح،پایین تریا بالاتر) درسایر دانشگاها و موسسات آموزش عالی ارائه نشده است.
 \item
چنانچه بعد از فراغت از تحصیل،قصد استفاده و هر گونه بهره برداری اعم از چاپ کتاب،ثبت اختراع و ... از این پایان نامه داشته باشم،از حوزه معاونت پژوهشی واحد مجوزهای مربوطه را اخذ نمایم.
    \item
     چنانچه در هر مقطع زمانی خلاف موارد فوق ثابت شود،عواقب ناشی از آن را می پذیرم و واحد دانشگاهی مجاز است بااینجانب مطابق ضوابط و مقررات رفتار نموده ودر صورت ابطال مدرک تحصیلی‎ام هیچگونه ادعایی نخواهم داشت.
     \end{enumerate}

\vspace{.5cm}
\begin{flushleft}
\begin{tabular}{lr}
نام و نام خانوادگی:   & 	\@name{} \@surname \\
 تاریخ و امضا: & \\
\end{tabular}
\end{flushleft}
}

% مجوز بهره‌برداری از پایان‌نامه
\newcommand{\mojavezPage}
{
\newpage
%\thispagestyle{empty}
\begin{center}
{\Large \titlefont
مجوز بهره‌برداری از پایان‌نامه \\
 }
\vspace{.5cm}
\end{center}
\doublespacing 

بهره‌برداری از این پایان‌نامه در چهارچوب مقررات كتابخانه و با توجه به محدودیتی كه توسط استاد راهنما به شرح زیر تعیین می‌شود، بلامانع است:

\noindent$\Box$ بهره‌برداری از این پایان‌نامه برای همگان بلامانع است.\\
$\Box$ بهره‌برداری از این پایان‌نامه با اخذ مجوز از استاد راهنما، بلامانع است.\\
$\Box$ بهره‌برداری از این پایان‌نامه تا تاریخ .................................... ممنوع است.\\

\vspace{.5cm}
\begin{flushleft}
\begin{tabular}{l p{.25\textwidth}}
% چون & در ماکروی دخل جدول مشکل ایجاد می‌کرد مجبور شدم دو تیکه بنویسم
\ifx\@firstsupervisor\undefined%
	\relax
\else
	\ifx\@secondsupervisor\undefined%
		استاد راهنما:
	\else
		اساتید راهنما: 
	\fi
\fi
&
\ifx\@firstsupervisor\undefined%
	\relax
\else
	\ifx\@secondsupervisor\undefined%
		\@firstsupervisor
	\else
		\@firstsupervisor{} \newline \@secondsupervisor
	\fi
\fi \\
  تاریخ: & \\
	 امضا: &\\
\end{tabular}
\end{flushleft}
}

% \def\frame{\newpage
% \thispagestyle{empty}
% \begin{framed}\thispagestyle{empty}}
% \def\endframe{\thispagestyle{empty}\end{framed}
% \thispagestyle{empty}
% \newpage
% }
\newcommand\abstractPage{
\pagenumbering{arabic}
\thispagestyle{empty}
\addcontentsline{toc}{section}{چکیده}
\vskip 15mm
{\noindent\bfseries چکیده}
\vspace{5mm}
\par
\noindent
\@fa-abstract
%\vspace{8mm}
\par
\noindent
\textbf{واژگان کلیدی:} 
\@keywords
}

% \def\latinabstract{\newpage
% \thispagestyle{empty}
% \vskip 15mm
% \begin{center}%{\Large\bfseries \@latintitle \\[5mm]}
% {\bfseries Abstract}
% \end{center}
% \vspace{5mm}}

% \def\endlatinabstract{\newpage}

\def\acknowledgementpage{\newpage
\thispagestyle{empty}
\centerline{\Large \bfseries قدردانی}
\vspace{1cm}
\par\noindent}
\def\endacknowledgementpage{\newpage}

\def\titlepage{\newpage\centering
  \thispagestyle{empty}
  \parindent 0pt \parskip 10pt plus 1fil minus 1fil
  \def\baselinestretch{1}\@normalsize\vbox to \vsize\bgroup\vbox to 9in\bgroup}
\def\endtitlepage{\par\kern 0pt\egroup\vss\egroup\newpage}

\def\signature{\vspace{1cm}
\begin{flushleft}
{%\nastaliq \scriptsize 
\@name\ \@surname \\
\@thesisdate}
\end{flushleft}}

% \def\abstract{
% \newpage
% \subsection*{چکیده}\small
% \@normalsize
% \@fa-abstract
% }
% \def\endabstract{\par}

%\pagenumbering{harfi}
%\let\ol@chapter\@chapter
%\def\@chapter{%
%  \ifnum\c@chapter=0 \pagenumbering{arabic}\setcounter{page}{1}\fi
%  \ol@chapter}

%\font\latintitlefont=cmssbx10 scaled 2300 %cmssbx10 scaled 2300
\font\supervisorfont=cmbxti10

\newcommand{\latinfirstPage}{%
\newpage\clearpage
\thispagestyle{empty}
\vskip 15mm
{\noindent\bfseries Abstract:}
\vspace{5mm}
\par
\noindent
\@en-abstract
\vspace{8mm}
\par
\noindent
\textbf{Keywords:} 
\@latinkeywords

\begin{titlepage}
\vspace{-10mm}
{\includegraphics[height=4.5cm]{files/iau}}
\centerline{\bf \@latinuniversity} 
\large\bfseries
\@latinbranch\space Branch


Faculty of\space\@latinfaculty\space Department of\space\@latinsubject

\@latinthesistype
\vskip 1cm
{%\latintitlefont 
\Huge
\@latintitle}
%\baselineskip=.750cm \par
\vskip 15mm
%{
%\large
%\if@bscthesis 
   % Bachelor of Science Thesis
%	in  \@latinsubject 
%\else
%	A Thesis Submitted in Partial Fulfillment of the Requirement for the Degree of 
%	 \if@mscthesis
%	Master of Science
%	\else
%	 Doctor of Philosophy
%	\fi
%	in  \@latinsubject 
	%\baselineskip=.750cm
	%\addtolength{\baselineskip}{-5mm}
%\fi
%}


\vskip 15mm

\large
{\ifx\@firstlatinsupervisor\undefined%
\ifx\@secondlatinsupervisor\undefined%
\else\fi
\else
\ifx\@secondlatinsupervisor\undefined%
Thesis Advisor :
{\Large\bfseries\par
\@firstlatinsupervisor}
\else
\large
Thesis Advisors:
\par
{\Large\bfseries \@firstlatinsupervisor{} and \@secondlatinsupervisor}
\fi\fi}
\par
\large
{\ifx\@firstlatinadvisor\undefined%
\ifx\@secondlatinadvisor\undefined%
\else\fi
\else
\ifx\@secondlatinadvisor\undefined%
Consulting Advisor:
{\Large\bfseries\par
\@firstlatinadvisor}
\else

\large
Consulting Advisors:
\par
{\Large\bfseries\@firstlatinadvisor{} and \@secondlatinadvisor}
\fi\fi}
\vskip 5mm

\par
\vskip 1cm
%\vskip 15mm
{\bfseries\latinby}\par
{\large %\supervisorfont
\rm\@latinname \; \@latinsurname}\par
{\@latinthesisdate}
\par
\vskip 1cm

\par

\vfill
%
\end{titlepage}
\fi}

\def\onvan{عنوان}
\def\writtenfor{برای دریافت درجه }
\def\by{پژوهشگر}
\def\latinby{By:}
\def\cleardoublepage{\clearpage\if@twoside \ifodd\c@page\else
\hbox{}
\thispagestyle{empty}
\newpage
\if@twocolumn\hbox{}\newpage\fi\fi\fi}




%% M.Amintoosi
%% 
%% Copyright © 2011-2012      by Vahid Damanafshan     
%% 
%% Distributable under the LaTeX Project Public License,
%% version 1.3c or higher (your choice). The latest version of
%% this license is at: http://www.latex-project.org/lppl.txt
%% 
%% This work is "maintained" (as per LPPL maintenance status)
%%  by Vahid Damanafshan.
%% 
%% 
%% 
%% 
%% Special thanks to Vafa Khalighi for his invaluable hints.
%%
%% End of file `IUST-Thesis.cls'.
