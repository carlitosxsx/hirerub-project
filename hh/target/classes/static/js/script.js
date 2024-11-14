let currentIndex = 1;

function updateCarousel() {
  const cards = document.querySelectorAll('.card');
  cards.forEach((card, index) => {
    card.classList.remove('active');
    if (index === currentIndex) {
      card.classList.add('active');
    }
  });
}

function nextSlide() {
  const cards = document.querySelectorAll('.card');
  currentIndex = (currentIndex + 1) % cards.length;
  updateCarousel();
}

function prevSlide() {
  const cards = document.querySelectorAll('.card');
  currentIndex = (currentIndex - 1 + cards.length) % cards.length;
  updateCarousel();
}

updateCarousel();